<h1 align="center">显示所有的数据</h1>
<div align="center">
	<table border="1">
		<tr>
			<td colspan="3" style="text-align: center;">所有城市</td>
		</tr>
		<tr>
			<td>name</td>
			<td>state</td>
			<td>country</td>
		</tr>
		<#list cities as city>
		<tr>
			<td>${city.name}</td>
			<td>${city.state}</td>
			<td>${city.country}</td>
		</tr>
		</#list>	
	</table>
</div>