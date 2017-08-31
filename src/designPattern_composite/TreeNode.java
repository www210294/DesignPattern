package designPattern_composite;

import java.util.ArrayList;
//import java.util.Enumeration;
import java.util.List;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TreeNode {
	public TreeNode(String name) {
		this.name = name;
	}
	private String name;
	private TreeNode parent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	private List<TreeNode> children = new ArrayList<TreeNode>();
	public void add(TreeNode node) {
		children.add(node);
	}
	public void remove(TreeNode node) {
		children.remove(node);
	}
	/*public Enumeration<TreeNode> getChildren() {
	}*/
	
}
