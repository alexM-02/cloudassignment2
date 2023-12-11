import requests
import time
import random

def monitor_service():
    # Define the URLs of my backend services
    backend_urls = [
        "http://localhost:89/",
        "http://localhost:90/",
        "http://localhost:8000/",
        "http://localhost:5050/",
        "http://localhost:91/",
        "http://localhost:92/",
        "http://localhost:93/",
    ]

    for url in backend_urls:
        # Generate random session names and attendance hours for testing
        random_session_name = f"Session_{random.randint(1, 100)}"
        random_attendance_hours = random.randint(1, 10)

        # Define the parameters for the request
        params = {
            "session_name": random_session_name,
            "attendance_hours": random_attendance_hours,
        }

        # Record the start time for performance measurement
        start_time = time.time()

        # Make the HTTP request
        response = requests.get(url, params=params)

        # Record the end time for performance measurement
        end_time = time.time()

        # Check correctness of results against expectations
        expected_result = "Expected Result"  
        actual_result = response.text.strip()

        if actual_result == expected_result:
            print(f"[{url}] Test passed")
        else:
            print(f"[{url}] Test failed. Expected: {expected_result}, Actual: {actual_result}")

        # Check overall performance (response time)
        response_time = end_time - start_time
        print(f"[{url}] Response Time: {response_time} seconds")

# Set up periodic monitoring (adjust the interval as needed)
while True:
    monitor_service()
    time.sleep(5)  # Check every 5 seconds
