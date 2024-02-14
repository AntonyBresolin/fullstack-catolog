import React from "react";

const Navbar1 = () => {
  return (
    <div className="w-full py-4 px-[10%] bg-blue-300 flex justify-between text-white items-center select-none">
      <a href="#"><h1 className="text-2xl font-bold hover:text-gray-200 duration-150 ease-in-out cursor-pointer">Navbar1</h1></a>
      <div className="flex justify-between">
        <a className="font-medium text-lg hover:text-gray-100 duration-150 ease-in-out cursor-pointer px-2" href="#">Home</a>
        <a className="font-medium text-lg hover:text-gray-100 duration-150 ease-in-out cursor-pointer px-2" href="#">About</a>
        <a className="font-medium text-lg hover:text-gray-100 duration-150 ease-in-out cursor-pointer px-2" href="#">Contact</a>
      </div>
    </div>
  );
}

export default Navbar1;