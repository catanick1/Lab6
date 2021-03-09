class Main {
  public static void main(String[] args) {
    
    //Creation of Tree Objects
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple", "broadleaf", true, "red");
    Tree tree3 = new Tree("spruce", "conifer", false, "");

    tree1.print();
    tree2.print();
    tree3.print();
  }
}

class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  //Default Constructor - returns blank tree name
  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
  
  //Parameterized Constructor
  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  //Accessor Methods - get and set 
  String getTreeName() {
    return treeName;
  }

  String getTreeType() {
    return treeType;
  }

  boolean getLeavesFall() {
    return leavesFall;
  }

  String getLeafColor() {
    return leafColor;
  }

  //Accessor Methods
  void setTreeName(String theName) {
    treeName = theName;
  }

  void setTreeType(String theType) {
    treeType = theType;
  }

  void setLeavesFall(boolean theLeavesFall) {
    leavesFall = theLeavesFall;
    }

  void setLeafColor(String theLeafColor) {
    leafColor = theLeafColor;
  }

  // Print Method all on one big line
  void print() {
    // Ternary operator to assign a boolean value to a string replacement
    String leavesFallStatus = leavesFall ? "does" : "does not";
  
    System.out.println();
    System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + leavesFallStatus + " lose its leaves for the winter.");
  }
}
