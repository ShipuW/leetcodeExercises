public class Solution {
    public String simplifyPath(String path) {
        Stack stack = new Stack();
        /*
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i)=='/'){
                continue;
            }else if(path.charAt(i)=='.'){
                if(i+1>=path.length())continue;
                if(path.charAt(i+1)=='.'){
                    if(!stack.empty())
                        stack.pop();
                    i++;
                }else{
                    continue;
                }
            }else{
                stack.push(path.charAt(i));
            }
        }
        //wrong case "/..."
        */
        String[] split = path.split("/");
		for (String a : split) {
			if (!a.equals(".") && !a.isEmpty()) {
				if (a.equals("..")) {
					if (!stack.isEmpty())
						stack.pop();
				} else {
					stack.push(a);
				}
			}
		}
        
        StringBuilder res = new StringBuilder();
        if(stack.empty()) return "/";
        while(!stack.empty()){
            
            res.insert(0, stack.pop());
            res.insert(0, "/");
        }
        return res.toString();
    }
}