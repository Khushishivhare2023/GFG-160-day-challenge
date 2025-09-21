class Solution {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : arr) {
            if (isOperator(token)) {
                int b = stack.pop();  
                int a = stack.pop(); 
                int res = 0;
                
                switch (token) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        if (a % b != 0 && ((a < 0) ^ (b < 0))) {
                            res--;
                        }
                        break;
                    case "^":
                        res = (int) Math.pow(a, b);
                        break;
                }
                
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") ||
               token.equals("/") || token.equals("^");
    }
}