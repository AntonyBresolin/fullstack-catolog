import React from "react";

const LPSidebar = () => {
  return (
    <div className="flex flex-col h-screen w-[20vw] bg-gray-50 shadow-md rounded-md select-none items-center text-center">
      <h1 className="py-4 text-xl font-semibold">Welcome to catalog</h1>
      <p className="py-4 font-light">This is a catalog of items</p>
      <hr className="w-full" />
      <div className="py-4">
        <button className="px-4 py-2 bg-neutral-600 text-white rounded-md shadow-md hover:bg-neutral-700 duration-150 ease-in-out">Acessar repositório</button>
      </div>
      <ul className="text-left flex-1 overflow-y-auto w-full pl-8">
        <ul className="py-2 font-semibold">Navbar
          <li>1</li>
          <li>2</li>
        </ul>
        <ul className="py-2">Button</ul>
        <ul className="py-2">Cards</ul>
        <ul className="py-2">Input Text</ul>
      </ul>
    </div>
  );
}

export default LPSidebar;