// Node object
	this.id = id;
	this.pid = pid;
	this.name = name;
	this.url = url;
	this.title = title;
	this.target = target;
	this._io = open || false;
	this._is = false;
	this._ls = false;
	this._hc = false;
	this._ai = 0;
	this._p;
};
// Tree object
	this.config = {
		target					: null,
		folderLinks			: true,
		useSelection		: true,
		useCookies			: true,
		useLines				: true,
		useStatusText		: false,
		closeSameLevel	: false,
		inOrder					: false
	}
	this.obj = objName;
	this.aNodes = [];
	this.aIndent = [];
	this.root = new Node(-1);
	this.selectedNode = null;
	this.selectedFound = false;
	this.completed = false;
};
// Adds a new node to the node array

// Outputs the tree to the page
dTree.prototype.toString = function() {
	var str = '<ul id="dhtmlgoodies_tree2" class="dhtmlgoodies_tree">';
	if (document.getElementById) {
	str += '</ul>';
	return str;
// Creates the tree structure
};
// Creates the node , url and text
// Checks if a node has any children and if it is the last sibling
};