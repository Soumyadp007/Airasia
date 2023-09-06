<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
    <h2>Flight Details</h2>
    Flight Number: ${airasia.flightNumber}
    </br>
    Operating Airline: ${airasia.operatingAirlines}</br>
    Departure City: ${airasia.departureCity}</br>
    Arrival City: ${airasia.arrivalCity}</br>
    Departure Date:${flight.dateOfDeparture}</br>
    <h2>Enter Passenger Details</h2>
    <form action="confirmReservation" method="post">
    <pre>
        first name<input type="text" name="firstName"/>
        last name<input type="text" name="lastName"/>
        middle name<input type="text" name="middleName"/> 
        email<input type="text" name="email"/>      
        phone<input type="text" name="phone"/>
        <input type="hidden" name="flightId" value="${flight.id}"/>
        <h2>Enter the payment details</h2>
         Card Holder Name<input type="text" name="cardHolderName"/>
        card Number<input type="text" name="cardNumber"/>
        CVV code<input type="text" name="cvvcode"/>
        ExpirationDate<input type="text" name="expirationDate"/>
        <input type="submit" value="complete reservation"/> 
    </pre>    
    </form>
</body>
</html>