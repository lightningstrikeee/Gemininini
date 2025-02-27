package HolidayTravelVehicles;

class main
{
    public static void main(String args[])
    {
        Vehicle myVehicle = Vehicle.createNewVehicleRecord(
            "Hyu-001", 
            "Hyundai", 
            "Elantra N", 
            2024, 
            "Hyundai", 
            100000
        );

        System.out.println(
             String.format(
                "Vehicle: %s | Manufacturer: %s", 
                (myVehicle.name + " " + myVehicle.model), 
                myVehicle.manufacturer
            )
        );
        System.out.println(String.format("Year: %s - $%s", myVehicle.year, myVehicle.baseCost));
    }
}