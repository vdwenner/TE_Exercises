package com.techelevator;

    public class AirplaneExample {
        //Instance Variables
        private String planeNumber;
        private int totalFirstClassSeats;
        private int bookedFirstClassSeats;
        private int totalCoachSeats;
        private int bookedCoachSeats;

        //Derived Variables
        public int getAvailableFirstClassSeats() {
            return ( totalFirstClassSeats - bookedFirstClassSeats);
        }
        public int getAvailableCoachSeats(){
            return (totalCoachSeats - bookedCoachSeats);
        }

        // Getters and Setters
        public String getPlaneNumber() {
            return planeNumber;
        }

        public int getTotalFirstClassSeats() {
            return totalFirstClassSeats;
        }

        public int getBookedFirstClassSeats() {
            return bookedFirstClassSeats;
        }

        public int getTotalCoachSeats() {
            return totalCoachSeats;
        }

        public int getBookedCoachSeats() {
            return bookedCoachSeats;
        }

        //Constructor
        public AirplaneExample(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
            this.planeNumber = planeNumber;
            this.totalFirstClassSeats = totalFirstClassSeats;
            this.totalCoachSeats = totalCoachSeats;
        }

        //Methods
        public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
            if (forFirstClass = true) {
                bookedFirstClassSeats = (bookedFirstClassSeats + totalNumberOfSeats);
                if (bookedFirstClassSeats > getAvailableFirstClassSeats()) {
                    return false;
                }

            }   else if(forFirstClass = false) {
                bookedCoachSeats = (bookedCoachSeats + totalNumberOfSeats);
                if (bookedCoachSeats > getAvailableCoachSeats()) {
                    return false;
                }

            }
            return true;
        }


        public boolean reserveSeats2(boolean forFirstClass, int totalNumberOfSeats) {

            if (forFirstClass == true) { //Process the requested totalNumberOfSeats against 1st Class
                if(totalNumberOfSeats <= getAvailableFirstClassSeats()){ //If requested # seats available, THEN book them
                    bookedFirstClassSeats += totalNumberOfSeats; // Increase the total 1st Class booked
                    return true; // Confirm Reservation successful
                }

            }   else { //No need for else if as forFirstClass is a boolean
                if(totalNumberOfSeats <= getAvailableCoachSeats()){ //If requested # seats available, THEN book them
                    bookedCoachSeats += totalNumberOfSeats; // Increase the total Coach Class booked
                    return true; // Confirm Reservation successful
                }
            }
            return false; //Neither class can have seats booked, flow will fall through to here
        }

    }


