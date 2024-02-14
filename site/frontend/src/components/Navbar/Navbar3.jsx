import React from "react";

const Navbar3 = () => {
  return (
    <div className="w-full py-2 px-[10%] bg-green-500 flex justify-between text-white items-center select-none">
      <a href="#"><h1 className="text-2xl font-bold hover:text-gray-300 duration-150 ease-in-out cursor-pointer">Navbar3</h1></a>
      <div className="flex justify-between items-center">
        <a className="px-4 py-1 text-lg bg-white text-green-500 rounded-md mx-2 hover:bg-gray-300 hover:text-green-700 duration-150 ease-in-out font-semibold cursor-pointer">Login</a>
        <a className="px-4 py-1 text-lg border-2 border-white rounded-md mx-2 hover:border-gray-600 hover:text-gray-600 duration-150 ease-in-out font-semibold cursor-pointer">Register</a>
      </div>
    </div>
  );
}

export default Navbar3;