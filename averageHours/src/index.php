<?php
header("Access-Control-Allow-Origin: *");
header("Content-type: application/json");
require('functions.inc.php');


$attendance_1 = $_REQUEST['attendance_1'];
$attendance_2 = $_REQUEST['attendance_2'];
$attendance_3 = $_REQUEST['attendance_3'];
$attendance_4 = $_REQUEST['attendance_4'];



$attendances = array($attendance_1, $attendance_2, $attendance_3, $attendance_4);



$output= getAverage($attendances);




echo json_encode($output);
exit();
?>
