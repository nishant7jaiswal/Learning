package HelperClasses;

public class TestDriver {

    private PageManagerHelper pageManagerHelper;
    private StepDefsHook stepDefsHook;

    public PageManagerHelper getPageManagerHelper() {
        if (pageManagerHelper == null){
            pageManagerHelper= new PageManagerHelper(stepDefsHook.getDriver());
        }
        return pageManagerHelper;
    }

    public StepDefsHook getStepDefsHook() {
        if(stepDefsHook==null){

            stepDefsHook = new StepDefsHook();
        }
        return stepDefsHook;
    }





}
