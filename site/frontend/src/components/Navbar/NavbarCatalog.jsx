import React from "react";
import Navbar1 from "./Navbar1";
import Navbar2 from "./Navbar2";
import Navbar3 from "./Navbar3";

const NavbarCatalog = () => {
  return (
    <div>
      <div className="w-full py-4 bg-neutral-600 flex items-center justify-center select-none">
        <h1 className="text-2xl font-semibold text-white">Navbar</h1>
      </div>
      <div className="w-full py-4 flex flex-col">
        <Navbar1 />
        <Navbar2 />
        <Navbar3 />
        
      </div>
    </div>
  );
}

export default NavbarCatalog;