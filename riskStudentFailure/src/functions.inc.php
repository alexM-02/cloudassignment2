<?php
function getRisk($attendances)
{
     // this button calculates engagement score first and then the risk

     $lecTotal = ($attendances[0] * 0.3) / 33;
     $labTotal = ($attendances[1] * 0.4) / 22;
     $suppTotal = ($attendances[2] * 0.15) / 44;
     $canvasTotal = ($attendances[3] * 0.15) / 55;

     $engagementScore = 100 * ($lecTotal + $labTotal + $suppTotal + $canvasTotal);  

     // Compare the sum to the fifth variable
     if ($engagementScore < $attendances[4]) {
         return 'Fail';
     } else {
         return 'Pass';
     }
}
?>
