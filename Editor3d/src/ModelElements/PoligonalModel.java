package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;



    public PoligonalModel(List<Texture> Textures) {
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;


        this.Poligons.add(new Poligon(new Point3D()));
    }
}
