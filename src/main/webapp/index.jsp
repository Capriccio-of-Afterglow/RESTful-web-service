<!DOCTYPE html>
<html>
	<head>
		<h1>let me try try</h1>
	<script>
        fetch('/my-api')
            .then(response => response.json())
            .then(data => {
                document.getElementById('api-content').innerText = data.message;
            })
            .catch(error => console.error('Error fetching API:', error));
    </script>
	<div id="api-content"></div>
	</head>
</html>