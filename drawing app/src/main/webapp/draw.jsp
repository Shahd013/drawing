<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Draw</title>
</head>
<body>
<h2>Create Shape</h2>
<form action="draw" method="post">
    Shape Type:
    <select name="shapeType">
        <option value="circle">Circle</option>
        <option value="rectangle">Rectangle</option>
    </select><br>
    X: <input type="text" name="x"><br>
    Y: <input type="text" name="y"><br>
    Color: <input type="text" name="color"><br>
    <div id="radiusField" style="display: none;">Radius: <input type="text" name="radius"></div>
    <div id="dimensionsField" style="display: none;">
        Width: <input type="text" name="width"><br>
        Height: <input type="text" name="height"><br>
    </div>
    <input type="submit" value="Create">
</form>

<%-- JavaScript to show/hide radius/dimensions fields based on shape type --%>
<script type="text/javascript">
    document.querySelector('select[name="shapeType"]').addEventListener('change', function () {
        var radiusField = document.getElementById('radiusField');
        var dimensionsField = document.getElementById('dimensionsField');
        if (this.value === 'circle') {
            radiusField.style.display = 'block';
            dimensionsField.style.display = 'none';
        } else {
            radiusField.style.display = 'none';
            dimensionsField.style.display = 'block';
        }
    });
</script>
</body>
</html>