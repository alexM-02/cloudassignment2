from flask import Flask, request, jsonify, Response ,make_response
from flask_cors import CORS, cross_origin


app = Flask(__name__)
CORS(app)


@app.route('/', methods=['GET'])
@cross_origin(origins='*')
def calculate():
    

    attendance_1 = request.args.get('attendance_1')
    attendance_2 = request.args.get('attendance_2')
    attendance_3 = request.args.get('attendance_3')
    attendance_4 = request.args.get('attendance_4')

    
    total_attendances = int(attendance_1) +  int(attendance_2) + int(attendance_3) + int(attendance_4)

    #return make_response((total_attendances),200)
    return jsonify({'total_attendance' : total_attendances})


if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)
