package be.mabi.ohana.smurf;

public class SmurfAssembler {
    public static SmurfR toRepresentation(Smurf smurf) {
        return new SmurfR(smurf.getId(), smurf.getName(), smurf.getCreationDate());
    }
}
