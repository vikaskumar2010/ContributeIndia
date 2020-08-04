import React, { Component } from "react";
 
class Stuff extends Component {

  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      image: "abc"
    };
  }

  componentDidMount() {
    fetch("https://dog.ceo/api/breeds/image/random")
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            image: result.message
          });
        },
        // Note: it's important to handle errors here
        // instead of a catch() block so that we don't swallow
        // exceptions from actual bugs in components.
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )
  }

  render() {
    const { error, isLoaded, image } = this.state;
    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
        <div>
        <h2>STUFF</h2>
        <p>This is place to put stuff. Random image of dog</p>
        <img src={image} />
      </div>
      );
    }
  }
}
 
export default Stuff;