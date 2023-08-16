package pack_TA;

public class Solution {
    public static void main(String[] args) {
        // Create an array of TravelAgencies objects
        TravelAgencies[] agencies = {
            new TravelAgencies(1, "Agency A", "Type A", 19990, true),
            new TravelAgencies(2, "Agency B", "Type B", 100, false),
            new TravelAgencies(3, "Agency C", "Type A", 1290, true)
        };
        
        // Call the static methods
        int highestPackagePrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println("Highest Package Price: " + highestPackagePrice);
        
        TravelAgencies agencyDetails = agencyDetailsForGivenIdAndType(agencies, 3, "Type A");
        if (agencyDetails != null) {
            System.out.println("Agency Name: " + agencyDetails.getAgencyName() + " Price: " + agencyDetails.getPrice());
        } else {
            System.out.println("No matching agency found.");
        }
    }
    
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int highestPrice = 0;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > highestPrice) {
                highestPrice = agency.getPrice();
            }
        }
        return highestPrice;
    }
    
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
         for (TravelAgencies agency : agencies) {
            if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType) && agency.hasFlightFacility()) {
                return agency;
            }
        }
        return null;
    }
}