<?php
function getAverage($attendances)
{
    // Calculate the sum of attendances
    $sum = array_sum($attendances);

    // Calculate the average
    $average = $sum / count($attendances);

    // Round the average to 2 decimal places
    $roundedAverage = round($average, 2);

    return $roundedAverage;
}

?>
