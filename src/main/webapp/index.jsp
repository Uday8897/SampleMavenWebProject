<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        form {
            display: inline-block;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            width: 45%;
            padding: 10px;
            margin: 5px;
            border: none;
            border-radius: 5px;
            background-color: #000000;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="CalculatorServlet" method="post">
        <input type="text" name="num1" placeholder="Enter first number" required>
        <input type="text" name="num2" placeholder="Enter second number" required>
        <br>
        <button type="submit" name="operation" value="add">Add</button>
        <button type="submit" name="operation" value="subtract">Subtract</button>
        <br>
        <button type="submit" name="operation" value="multiply">Multiply</button>
        <button type="submit" name="operation" value="divide">Divide</button>
    </form>
</body>
</html>
