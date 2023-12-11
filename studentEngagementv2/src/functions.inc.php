<?php
function getEngage($attendances)
{
     // this button calculates engagement score first

     $lecTotal = ($attendances[0] * 0.3) / 33;
     $labTotal = ($attendances[1] * 0.4) / 22;
     $suppTotal = ($attendances[2] * 0.15) / 44;
     $canvasTotal = ($attendances[3] * 0.15) / 55;

    $engagementScore = $lecTotal + $labTotal + $suppTotal + $canvasTotal;  

    $roundedScore = round($engagementScore, 2);

    return $roundedScore;
     
}
?>
