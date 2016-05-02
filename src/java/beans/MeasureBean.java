/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.org.apache.bcel.internal.generic.D2F;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergey
 */
@Named(value = "measureBean")
@SessionScoped
public class MeasureBean implements Serializable {

    private double total;

    private boolean number1InsulatAtticBlownCheckBox;
    private String number1InsulatAtticBlownString;
    private int sqft1;
    private double number1InsulatAtticBlownResult;

    private boolean number2RemoveAndReplaceCheckBox;
    private int sqft2;
    private double number2RemoveAndReplaceResult;

    private boolean number3InstallBattedInsulationCheckBox;
    private int sqft3;
    private double number3InstallBattedInsulationResult;

    private boolean number4SealDuctingCodeComplianceCheckBox;
    private String number4SealDuctingCodeComplianceString;
    private int sqft4;
    private double number4SealDuctingCodeComplianceResult;

    private int sqft5;
    private boolean number5AirSealPackageCheckBox;
    private String number5AirSealPackageString;
    private double number5AirSealPackageResult;

    private int sqft6;
    private boolean number6CAZAreaReportCheckBox;
    private String number6CAZAreaReportString;
    private double number6CAZAreaReportResult;

    private int sqft7a;
    private boolean number7AInstallDuctingStandaloneCheckBox;
    private String number7AInstallDuctingStandaloneString;
    private double number7AInstallDuctingStandaloneResult;

    private int sqft7b;
    private boolean number7BInstallR8DuctingNewHVACCheckBox;
    private String number7BInstallR8DuctingNewHVACString;
    private double number7BInstallR8DuctingNewHVACResult;

    private int sqft8a;
    private boolean number8ANewHVACSystemERICheckBox;
    private String number8ANewHVACSystemERIString;
    private double number8ANewHVACSystemERIResult;

    private int sqft8b;
    private boolean number8BNewHVACSystemERIPrivateCheckBox;
    private String number8BNewHVACSystemERIPrivateString;
    private double number8BNewHVACSystemERIPrivateResult;

    private int sqft8bii;
    private boolean number8BIIIncludes10YearPartsCheckBox;
    private String number8BIIIncludes10YearPartsString;
    private double number8BIIIncludes10YearPartsResult;

    private int sqft9;
    private boolean number9SingleDualZoneHVACSystemCheckBox;
    private String number9SingleDualZoneHVACSystemString;
    private double number9SingleDualZoneHVACSystemResult;

    private int sqft91;
    private boolean number91aRelocateCondenserCheckBox;
    private String number91aRelocateCondenserString;
    private double number91aRelocateCondenserResult;

    private boolean number91bCutInSupplyVentNewDuctCheckBox;
    private String number91bCutInSupplyVentNewDuctString;
    private double number91bCutInSupplyVentNewDuctResult;

    private boolean number91cHVACCutInCheckBox;
    private String number91cHVACCutInString;
    private double number91cHVACCutInResult;

    private boolean number91dDuctSealOnlyCheckBox;
    private String number91dDuctSealOnlyString;
    private double number91dDuctSealOnlyResult;

    private boolean number91eNewLineSetCheckBox;
    private String number91eNewLineSetString;
    private double number91eNewLineSetResult;

    private boolean number91fEnlargeReturnAirCheckBox;
    private String number91fEnlargeReturnAirString;
    private double number91fEnlargeReturnAirResult;

    /**
     * Creates a new instance of MeasureBean
     */
    public MeasureBean() {
    }

    //******************** 1. Number1InsulatAtticBlown***************************
    public int getSqft1() {
        return sqft1;
    }

    public void setSqft1(int sqft1) {
        this.sqft1 = sqft1;
    }

    public boolean isNumber1InsulatAtticBlownCheckBox() {
        return number1InsulatAtticBlownCheckBox;
    }

    public void setNumber1InsulatAtticBlownCheckBox(boolean number1InsulatAtticBlownCheckBox) {
        this.number1InsulatAtticBlownCheckBox = number1InsulatAtticBlownCheckBox;
    }

    public String getNumber1InsulatAtticBlownString() {
        if (this.number1InsulatAtticBlownString == null) {
            this.number1InsulatAtticBlownString = "0";
        }
        return number1InsulatAtticBlownString;
    }

    public void setNumber1InsulatAtticBlownString(String number1InsulatAtticBlownString) {
        this.number1InsulatAtticBlownString = number1InsulatAtticBlownString;
    }

    public double getNumber1InsulatAtticBlownResult() {
        if (isNumber1InsulatAtticBlownCheckBox() == true) {
            this.number1InsulatAtticBlownResult = Double.valueOf(getNumber1InsulatAtticBlownString()) * getSqft1();
        } else {
            this.number1InsulatAtticBlownResult = 0;
        }
        return number1InsulatAtticBlownResult;
    }

    public void setNumber1InsulatAtticBlownResult(double number1InsulatAtticBlownResult) {
        this.number1InsulatAtticBlownResult = number1InsulatAtticBlownResult;
    }

    //******************** 2. Fresh Start***************************
    public int getSqft2() {
        return sqft2;
    }

    public void setSqft2(int sqft2) {
        this.sqft2 = sqft2;
    }

    public boolean isNumber2RemoveAndReplaceCheckBox() {
        return number2RemoveAndReplaceCheckBox;
    }

    public void setNumber2RemoveAndReplaceCheckBox(boolean number2RemoveAndReplaceCheckBox) {
        this.number2RemoveAndReplaceCheckBox = number2RemoveAndReplaceCheckBox;
    }

    public double getNumber2RemoveAndReplaceResult() {
        if (isNumber2RemoveAndReplaceCheckBox() == true) {
            this.number2RemoveAndReplaceResult = 1.5 * getSqft2();
        } else {
            this.number2RemoveAndReplaceResult = 0;
        }
        return number2RemoveAndReplaceResult;
    }

    public void setNumber2RemoveAndReplaceResult(double number2RemoveAndReplaceResult) {
        this.number2RemoveAndReplaceResult = number2RemoveAndReplaceResult;
    }

    //******************** 3. Crawl Space Insulation ***************************
    public int getSqft3() {
        return sqft3;
    }

    public void setSqft3(int sqft3) {
        this.sqft3 = sqft3;
    }

    public boolean isNumber3InstallBattedInsulationCheckBox() {
        return number3InstallBattedInsulationCheckBox;
    }

    public void setNumber3InstallBattedInsulationCheckBox(boolean number3InstallBattedInsulationCheckBox) {
        this.number3InstallBattedInsulationCheckBox = number3InstallBattedInsulationCheckBox;
    }

    public double getNumber3InstallBattedInsulationResult() {
        if (isNumber3InstallBattedInsulationCheckBox() == true) {
            this.number3InstallBattedInsulationResult = 2 * sqft3;
        } else {
            this.number3InstallBattedInsulationResult = 0;
        }
        return number3InstallBattedInsulationResult;
    }

    public void setNumber3InstallBattedInsulationResult(double number3InstallBattedInsulationResult) {
        this.number3InstallBattedInsulationResult = number3InstallBattedInsulationResult;
    }

    //******************** 4. Seal Ducting to Code Compliance Standards ***************************
    public int getSqft4() {
        return sqft4;
    }

    public void setSqft4(int sqft4) {
        this.sqft4 = sqft4;
    }

    public boolean isNumber4SealDuctingCodeComplianceCheckBox() {
        return number4SealDuctingCodeComplianceCheckBox;
    }

    public void setNumber4SealDuctingCodeComplianceCheckBox(boolean number4SealDuctingCodeComplianceCheckBox) {
        this.number4SealDuctingCodeComplianceCheckBox = number4SealDuctingCodeComplianceCheckBox;
    }

    public String getNumber4SealDuctingCodeComplianceString() {
        if (this.number4SealDuctingCodeComplianceString == null) {
            this.number4SealDuctingCodeComplianceString = "0";
        }
        return number4SealDuctingCodeComplianceString;
    }

    public void setNumber4SealDuctingCodeComplianceString(String number4SealDuctingCodeComplianceString) {
        this.number4SealDuctingCodeComplianceString = number4SealDuctingCodeComplianceString;
    }

    public double getNumber4SealDuctingCodeComplianceResult() {
        if (isNumber4SealDuctingCodeComplianceCheckBox() == true) {
            this.number4SealDuctingCodeComplianceResult = Double.valueOf(getNumber4SealDuctingCodeComplianceString()) * sqft4;
        } else {
            this.number4SealDuctingCodeComplianceResult = 0;
        }
        return number4SealDuctingCodeComplianceResult;
    }

    public void setNumber4SealDuctingCodeComplianceResult(double number4SealDuctingCodeComplianceResult) {
        this.number4SealDuctingCodeComplianceResult = number4SealDuctingCodeComplianceResult;
    }

    //****************************** 5. Air Seal Package ************************************
    public int getSqft5() {
        return sqft5;
    }

    public void setSqft5(int sqft5) {
        this.sqft5 = sqft5;
    }

    public boolean isNumber5AirSealPackageCheckBox() {
        return number5AirSealPackageCheckBox;
    }

    public void setNumber5AirSealPackageCheckBox(boolean number5AirSealPackageCheckBox) {
        this.number5AirSealPackageCheckBox = number5AirSealPackageCheckBox;
    }

    public String getNumber5AirSealPackageString() {
        if (this.number5AirSealPackageString == null) {
            this.number5AirSealPackageString = "0";
        }
        return number5AirSealPackageString;
    }

    public void setNumber5AirSealPackageString(String number5AirSealPackageString) {
        this.number5AirSealPackageString = number5AirSealPackageString;
    }

    public double getNumber5AirSealPackageResult() {
        if (isNumber5AirSealPackageCheckBox() == true) {
            this.number5AirSealPackageResult = Double.valueOf(getNumber5AirSealPackageString()) * getSqft5();
        } else {
            this.number5AirSealPackageString = "0";
        }
        System.out.println("number5AirSealPackageCheckBox" + this.number5AirSealPackageCheckBox);
        System.out.println("number5AirSealPackageString" + this.number5AirSealPackageString);
        System.out.println("sqft5" + this.sqft5);
        System.out.println("" + this.number5AirSealPackageResult);
        return number5AirSealPackageResult;
    }

    public void setNumber5AirSealPackageResult(double number5AirSealPackageResult) {
        this.number5AirSealPackageResult = number5AirSealPackageResult;
    }

    //****************************** 6. CAZ Area Report *****************************************
    public int getSqft6() {
        return sqft6;
    }

    public void setSqft6(int sqft6) {
        this.sqft6 = sqft6;
    }

    public boolean isNumber6CAZAreaReportCheckBox() {
        return number6CAZAreaReportCheckBox;
    }

    public void setNumber6CAZAreaReportCheckBox(boolean number6CAZAreaReportCheckBox) {
        this.number6CAZAreaReportCheckBox = number6CAZAreaReportCheckBox;
    }

    public String getNumber6CAZAreaReportString() {
        if (this.number6CAZAreaReportString == null) {
            this.number6CAZAreaReportString = "0";
        }
        return number6CAZAreaReportString;
    }

    public void setNumber6CAZAreaReportString(String number6CAZAreaReportString) {
        this.number6CAZAreaReportString = number6CAZAreaReportString;
    }

    public double getNumber6CAZAreaReportResult() {
        if (isNumber6CAZAreaReportCheckBox() == true) {
            this.number6CAZAreaReportResult = Double.valueOf(getNumber6CAZAreaReportString()) * getSqft6();
        } else {
            this.number6CAZAreaReportResult = 0;
        }
        return number6CAZAreaReportResult;
    }

    public void setNumber6CAZAreaReportResult(double number6CAZAreaReportResult) {
        this.number6CAZAreaReportResult = number6CAZAreaReportResult;
    }

    //****************************** 7a. Install R-8 Ducting Standalone *****************************************
    public int getSqft7a() {
        this.sqft7a = 0;
        return sqft7a;
    }

    public void setSqft7a(int sqft7a) {
        this.sqft7a = 0;
        this.sqft7a = sqft7a;
    }

    public boolean isNumber7AInstallDuctingStandaloneCheckBox() {
        return number7AInstallDuctingStandaloneCheckBox;
    }

    public void setNumber7AInstallDuctingStandaloneCheckBox(boolean number7AInstallDuctingStandaloneCheckBox) {
        this.number7AInstallDuctingStandaloneCheckBox = number7AInstallDuctingStandaloneCheckBox;
    }

    public String getNumber7AInstallDuctingStandaloneString() {
        if (this.number7AInstallDuctingStandaloneString == null) {
            this.number7AInstallDuctingStandaloneString = "0";
        }
        return number7AInstallDuctingStandaloneString;
    }

    public void setNumber7AInstallDuctingStandaloneString(String number7AInstallDuctingStandaloneString) {
        this.number7AInstallDuctingStandaloneString = number7AInstallDuctingStandaloneString;
    }

    public double getNumber7AInstallDuctingStandaloneResult() {
        if (isNumber7AInstallDuctingStandaloneCheckBox() == true) {
            this.number7AInstallDuctingStandaloneResult = Double.valueOf(getNumber7AInstallDuctingStandaloneString()) * 1;
        } else {
            this.number7AInstallDuctingStandaloneResult = 0;
        }
        return number7AInstallDuctingStandaloneResult;
    }

    public void setNumber7AInstallDuctingStandaloneResult(double number7AInstallDuctingStandaloneResult) {
        this.number7AInstallDuctingStandaloneResult = number7AInstallDuctingStandaloneResult;
    }

    //******************************* 7b. Install R-8 Ducting w/ New HVAC System ******************************
    public int getSqft7b() {
        return sqft7b;
    }

    public void setSqft7b(int sqft7b) {
        this.sqft7b = sqft7b;
    }

    public boolean isNumber7BInstallR8DuctingNewHVACCheckBox() {
        return number7BInstallR8DuctingNewHVACCheckBox;
    }

    public void setNumber7BInstallR8DuctingNewHVACCheckBox(boolean number7BInstallR8DuctingNewHVACCheckBox) {
        this.number7BInstallR8DuctingNewHVACCheckBox = number7BInstallR8DuctingNewHVACCheckBox;
    }

    public String getNumber7BInstallR8DuctingNewHVACString() {
        if (this.number7BInstallR8DuctingNewHVACString == null) {
            this.number7BInstallR8DuctingNewHVACString = "0";
        }
        return number7BInstallR8DuctingNewHVACString;
    }

    public void setNumber7BInstallR8DuctingNewHVACString(String number7BInstallR8DuctingNewHVACString) {
        this.number7BInstallR8DuctingNewHVACString = number7BInstallR8DuctingNewHVACString;
    }

    public double getNumber7BInstallR8DuctingNewHVACResult() {
        if (isNumber7BInstallR8DuctingNewHVACCheckBox() == true) {
            this.number7BInstallR8DuctingNewHVACResult = Double.valueOf(getNumber7BInstallR8DuctingNewHVACString()) * sqft7b;
        } else {
            this.number7BInstallR8DuctingNewHVACResult = 0;
        }
        //!!!! Currently bloced
        this.number7BInstallR8DuctingNewHVACResult = 0;
        return number7BInstallR8DuctingNewHVACResult;
    }

    public void setNumber7BInstallR8DuctingNewHVACResult(double number7BInstallR8DuctingNewHVACResult) {
        this.number7BInstallR8DuctingNewHVACResult = number7BInstallR8DuctingNewHVACResult;
    }

    //******************************* 8a. New HVAC System (ERI Private Label) ******************************
    public int getSqft8a() {
        return sqft8a;
    }

    public void setSqft8a(int sqft8a) {
        this.sqft8a = sqft8a;
    }

    public boolean isNumber8ANewHVACSystemERICheckBox() {
        return number8ANewHVACSystemERICheckBox;
    }

    public void setNumber8ANewHVACSystemERICheckBox(boolean number8ANewHVACSystemERICheckBox) {
        this.number8ANewHVACSystemERICheckBox = number8ANewHVACSystemERICheckBox;
    }

    public String getNumber8ANewHVACSystemERIString() {
        if (this.number8ANewHVACSystemERIString == null) {
            this.number8ANewHVACSystemERIString = "0";
        }
        return number8ANewHVACSystemERIString;
    }

    public void setNumber8ANewHVACSystemERIString(String number8ANewHVACSystemERIString) {
        this.number8ANewHVACSystemERIString = number8ANewHVACSystemERIString;
    }

    public double getNumber8ANewHVACSystemERIResult() {
        if (isNumber8ANewHVACSystemERICheckBox() == true) {
            this.number8ANewHVACSystemERIResult = Double.valueOf(getNumber8ANewHVACSystemERIString()) * 1;
        } else {
            this.number8ANewHVACSystemERIResult = 0;
        }
        return number8ANewHVACSystemERIResult;
    }

    public void setNumber8ANewHVACSystemERIResult(double number8ANewHVACSystemERIResult) {
        this.number8ANewHVACSystemERIResult = number8ANewHVACSystemERIResult;
    }

    //******************************* 8b. New HVAC System (ERI Private Label) ******************************
    public int getSqft8b() {
        return sqft8b;
    }

    public void setSqft8b(int sqft8b) {
        this.sqft8b = sqft8b;
    }

    public boolean isNumber8BNewHVACSystemERIPrivateCheckBox() {
        return number8BNewHVACSystemERIPrivateCheckBox;
    }

    public void setNumber8BNewHVACSystemERIPrivateCheckBox(boolean number8BNewHVACSystemERIPrivateCheckBox) {
        this.number8BNewHVACSystemERIPrivateCheckBox = number8BNewHVACSystemERIPrivateCheckBox;
    }

    public String getNumber8BNewHVACSystemERIPrivateString() {
        if (this.number8BNewHVACSystemERIPrivateString == null) {
            this.number8BNewHVACSystemERIPrivateString = "0";
        }
        return number8BNewHVACSystemERIPrivateString;
    }

    public void setNumber8BNewHVACSystemERIPrivateString(String number8BNewHVACSystemERIPrivateString) {
        this.number8BNewHVACSystemERIPrivateString = number8BNewHVACSystemERIPrivateString;
    }

    public double getNumber8BNewHVACSystemERIPrivateResult() {
        if (isNumber8BNewHVACSystemERIPrivateCheckBox() == true) {
            this.number8BNewHVACSystemERIPrivateResult = Double.valueOf(getNumber8BNewHVACSystemERIPrivateString()) * 1;
        } else {
            this.number8BNewHVACSystemERIPrivateResult = 0;
        }
        return number8BNewHVACSystemERIPrivateResult;
    }

    public void setNumber8BNewHVACSystemERIPrivateResult(double number8BNewHVACSystemERIPrivateResult) {
        this.number8BNewHVACSystemERIPrivateResult = number8BNewHVACSystemERIPrivateResult;
    }

    //******************************* 8bii. Includes 10 Year Parts and Labor/MERV 11 Filtration/UV Coil ******************************
    public int getSqft8bii() {
        this.sqft8bii = 0;
        return sqft8bii;
    }

    public void setSqft8bii(int sqft8bii) {
        this.sqft8bii = sqft8bii;
    }

    public boolean isNumber8BIIIncludes10YearPartsCheckBox() {
        return number8BIIIncludes10YearPartsCheckBox;
    }

    public void setNumber8BIIIncludes10YearPartsCheckBox(boolean number8BIIIncludes10YearPartsCheckBox) {
        this.number8BIIIncludes10YearPartsCheckBox = number8BIIIncludes10YearPartsCheckBox;
    }

    public String getNumber8BIIIncludes10YearPartsString() {
        if (this.number8BIIIncludes10YearPartsString == null) {
            this.number8BIIIncludes10YearPartsString = "0";
        }
        return number8BIIIncludes10YearPartsString;
    }

    public void setNumber8BIIIncludes10YearPartsString(String number8BIIIncludes10YearPartsString) {
        this.number8BIIIncludes10YearPartsString = number8BIIIncludes10YearPartsString;
    }

    public double getNumber8BIIIncludes10YearPartsResult() {
        if (isNumber8BIIIncludes10YearPartsCheckBox() == true) {
            this.number8BIIIncludes10YearPartsResult = Double.valueOf(getNumber8BIIIncludes10YearPartsString()) * getSqft8bii();
        } else {
            this.number8BIIIncludes10YearPartsResult = 0;
        }
        //Usually = 0, why? I don't know
        this.number8BIIIncludes10YearPartsResult = 0;
        return number8BIIIncludes10YearPartsResult;
    }

    public void setNumber8BIIIncludes10YearPartsResult(double number8BIIIncludes10YearPartsResult) {
        this.number8BIIIncludes10YearPartsResult = number8BIIIncludes10YearPartsResult;
    }

    //******************** 9. Single/Dual Zone HVAC System ***************************
    public int getSqft9() {
        this.sqft9 = 0;
        return sqft9;
    }

    public void setSqft9(int sqft9) {
        this.sqft9 = sqft9;
    }

    public boolean isNumber9SingleDualZoneHVACSystemCheckBox() {
        return number9SingleDualZoneHVACSystemCheckBox;
    }

    public void setNumber9SingleDualZoneHVACSystemCheckBox(boolean number9SingleDualZoneHVACSystemCheckBox) {
        this.number9SingleDualZoneHVACSystemCheckBox = number9SingleDualZoneHVACSystemCheckBox;
    }

    public String getNumber9SingleDualZoneHVACSystemString() {
        if (this.number9SingleDualZoneHVACSystemString == null) {
            this.number9SingleDualZoneHVACSystemString = "0";
        }
        return number9SingleDualZoneHVACSystemString;
    }

    public void setNumber9SingleDualZoneHVACSystemString(String number9SingleDualZoneHVACSystemString) {
        this.number9SingleDualZoneHVACSystemString = number9SingleDualZoneHVACSystemString;
    }

    public double getNumber9SingleDualZoneHVACSystemResult() {
        if (isNumber9SingleDualZoneHVACSystemCheckBox() == true) {
            this.number9SingleDualZoneHVACSystemResult = Double.valueOf(getNumber9SingleDualZoneHVACSystemString()) * 1;
        } else {
            this.number9SingleDualZoneHVACSystemResult = 0;
        }
        return number9SingleDualZoneHVACSystemResult;
    }

    public void setNumber9SingleDualZoneHVACSystemResult(double number9SingleDualZoneHVACSystemResult) {
        this.number9SingleDualZoneHVACSystemResult = number9SingleDualZoneHVACSystemResult;
    }

    //******************** 9.1. Miscellaneous Items HVAC ***************************
    // 91a
    public int getSqft91() {
        return sqft91;
    }

    public void setSqft91(int sqft91) {
        this.sqft91 = sqft91;
    }

    public boolean isNumber91aRelocateCondenserCheckBox() {
        return number91aRelocateCondenserCheckBox;
    }

    public void setNumber91aRelocateCondenserCheckBox(boolean number91aRelocateCondenserCheckBox) {
        this.number91aRelocateCondenserCheckBox = number91aRelocateCondenserCheckBox;
    }

    public String getNumber91aRelocateCondenserString() {
        if (this.number91aRelocateCondenserString == null) {
            this.number91aRelocateCondenserString = "0";
        }
//        if ( isNumber91aRelocateCondenserCheckBox() == false ) {
//            this.number91aRelocateCondenserString = "0";
//        }
        return number91aRelocateCondenserString;
    }

    public void setNumber91aRelocateCondenserString(String number91aRelocateCondenserString) {
        this.number91aRelocateCondenserString = number91aRelocateCondenserString;
    }

    public double getNumber91aRelocateCondenserResult() {
        if (isNumber91aRelocateCondenserCheckBox() == true) {
            this.number91aRelocateCondenserResult = Double.valueOf(getNumber91aRelocateCondenserString());
        } else {
            this.number91aRelocateCondenserResult = 0;
        }
        return number91aRelocateCondenserResult;
    }

    public void setNumber91aRelocateCondenserResult(double number91aRelocateCondenserResult) {
        this.number91aRelocateCondenserResult = number91aRelocateCondenserResult;
    }

    //91b
    
    public boolean isNumber91bCutInSupplyVentNewDuctCheckBox() {
        return number91bCutInSupplyVentNewDuctCheckBox;
    }

    public void setNumber91bCutInSupplyVentNewDuctCheckBox(boolean number91bCutInSupplyVentNewDuctCheckBox) {
        this.number91bCutInSupplyVentNewDuctCheckBox = number91bCutInSupplyVentNewDuctCheckBox;
    }

    public String getNumber91bCutInSupplyVentNewDuctString() {
        if (this.number91bCutInSupplyVentNewDuctString == null) {
            this.number91bCutInSupplyVentNewDuctString = "0";
        }
//        if ( isNumber91aRelocateCondenserCheckBox() == false ) {
//            this.number91bCutInSupplyVentNewDuctString = "0";
//        }
        return number91bCutInSupplyVentNewDuctString;
    }

    public void setNumber91bCutInSupplyVentNewDuctString(String number91bCutInSupplyVentNewDuctString) {
        this.number91bCutInSupplyVentNewDuctString = number91bCutInSupplyVentNewDuctString;
    }

    public double getNumber91bCutInSupplyVentNewDuctResult() {
        if ( isNumber91bCutInSupplyVentNewDuctCheckBox() == true ) {
            this.number91bCutInSupplyVentNewDuctResult = Double.valueOf(getNumber91bCutInSupplyVentNewDuctString());
        } else {
            this.number91bCutInSupplyVentNewDuctResult = 0;
        }
        return number91bCutInSupplyVentNewDuctResult;
    }

    public void setNumber91bCutInSupplyVentNewDuctResult(double number91bCutInSupplyVentNewDuctResult) {
        this.number91bCutInSupplyVentNewDuctResult = number91bCutInSupplyVentNewDuctResult;
    }

    // 91c
    
    public boolean isNumber91cHVACCutInCheckBox() {
        return number91cHVACCutInCheckBox;
    }

    public void setNumber91cHVACCutInCheckBox(boolean number91cHVACCutInCheckBox) {
        this.number91cHVACCutInCheckBox = number91cHVACCutInCheckBox;
    }

    public String getNumber91cHVACCutInString() {
        if (this.number91cHVACCutInString == null) {
            this.number91cHVACCutInString = "0";
        }
        return number91cHVACCutInString;
    }

    public void setNumber91cHVACCutInString(String number91cHVACCutInString) {
        this.number91cHVACCutInString = number91cHVACCutInString;
    }

    public double getNumber91cHVACCutInResult() {
        if ( isNumber91cHVACCutInCheckBox() == true ) {
            this.number91cHVACCutInResult = Double.valueOf(getNumber91cHVACCutInString());
        } else {
            this.number91cHVACCutInResult = 0;
        }
        return number91cHVACCutInResult;
    }

    public void setNumber91cHVACCutInResult(double number91cHVACCutInResult) {
        this.number91cHVACCutInResult = number91cHVACCutInResult;
    }

    // 91d
    
    public boolean isNumber91dDuctSealOnlyCheckBox() {
        return number91dDuctSealOnlyCheckBox;
    }

    public void setNumber91dDuctSealOnlyCheckBox(boolean number91dDuctSealOnlyCheckBox) {
        this.number91dDuctSealOnlyCheckBox = number91dDuctSealOnlyCheckBox;
    }

    public String getNumber91dDuctSealOnlyString() {
        if (this.number91dDuctSealOnlyString == null) {
            this.number91dDuctSealOnlyString = "0";
        }
        return number91dDuctSealOnlyString;
    }

    public void setNumber91dDuctSealOnlyString(String number91dDuctSealOnlyString) {
        this.number91dDuctSealOnlyString = number91dDuctSealOnlyString;
    }

    public double getNumber91dDuctSealOnlyResult() {
        if ( isNumber91dDuctSealOnlyCheckBox() == true ) {
            this.number91dDuctSealOnlyResult = Double.valueOf(getNumber91dDuctSealOnlyString());
        } else {
            this.number91dDuctSealOnlyResult = 0;
        }
        return number91dDuctSealOnlyResult;
    }

    public void setNumber91dDuctSealOnlyResult(double number91dDuctSealOnlyResult) {
        this.number91dDuctSealOnlyResult = number91dDuctSealOnlyResult;
    }

    // 91e
    
    public boolean isNumber91eNewLineSetCheckBox() {
        return number91eNewLineSetCheckBox;
    }

    public void setNumber91eNewLineSetCheckBox(boolean number91eNewLineSetCheckBox) {
        this.number91eNewLineSetCheckBox = number91eNewLineSetCheckBox;
    }

    public String getNumber91eNewLineSetString() {
        if (this.number91eNewLineSetString == null) {
            this.number91eNewLineSetString = "0";
        }
        return number91eNewLineSetString;
    }

    public void setNumber91eNewLineSetString(String number91eNewLineSetString) {
        this.number91eNewLineSetString = number91eNewLineSetString;
    }

    public double getNumber91eNewLineSetResult() {
        if ( isNumber91eNewLineSetCheckBox() == true ) {
            this.number91eNewLineSetResult = Double.valueOf(getNumber91eNewLineSetString());
        } else {
            this.number91eNewLineSetResult = 0;
        }
        return number91eNewLineSetResult;
    }

    public void setNumber91eNewLineSetResult(double number91eNewLineSetResult) {
        this.number91eNewLineSetResult = number91eNewLineSetResult;
    }

    //91f
    
    public boolean isNumber91fEnlargeReturnAirCheckBox() {
        return number91fEnlargeReturnAirCheckBox;
    }

    public void setNumber91fEnlargeReturnAirCheckBox(boolean number91fEnlargeReturnAirCheckBox) {
        this.number91fEnlargeReturnAirCheckBox = number91fEnlargeReturnAirCheckBox;
    }

    public String getNumber91fEnlargeReturnAirString() {
        if (this.number91fEnlargeReturnAirString == null) {
            this.number91fEnlargeReturnAirString = "0";
        }
        return number91fEnlargeReturnAirString;
    }

    public void setNumber91fEnlargeReturnAirString(String number91fEnlargeReturnAirString) {
        this.number91fEnlargeReturnAirString = number91fEnlargeReturnAirString;
    }

    public double getNumber91fEnlargeReturnAirResult() {
        if ( isNumber91fEnlargeReturnAirCheckBox() == true ) {
            this.number91fEnlargeReturnAirResult = Double.valueOf(getNumber91fEnlargeReturnAirString());
        } else {
            this.number91fEnlargeReturnAirResult = 0;
        }
        return number91fEnlargeReturnAirResult;
    }

    public void setNumber91fEnlargeReturnAirResult(double number91fEnlargeReturnAirResult) {
        this.number91fEnlargeReturnAirResult = number91fEnlargeReturnAirResult;
    }
    
    

    //***********************************************************************
    public double getTotal() {
        this.total = getNumber1InsulatAtticBlownResult() + getNumber2RemoveAndReplaceResult()
                + getNumber3InstallBattedInsulationResult() + getNumber4SealDuctingCodeComplianceResult()
                + getNumber5AirSealPackageResult() + getNumber6CAZAreaReportResult()
                + getNumber7AInstallDuctingStandaloneResult() + getNumber7BInstallR8DuctingNewHVACResult()
                + getNumber8ANewHVACSystemERIResult() + getNumber8BNewHVACSystemERIPrivateResult()
                + getNumber8BIIIncludes10YearPartsResult() + getNumber9SingleDualZoneHVACSystemResult() 
                + getNumber91aRelocateCondenserResult() + getNumber91bCutInSupplyVentNewDuctResult()
                +getNumber91cHVACCutInResult() + getNumber91dDuctSealOnlyResult()
                + getNumber91eNewLineSetResult() + getNumber91fEnlargeReturnAirResult();
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
