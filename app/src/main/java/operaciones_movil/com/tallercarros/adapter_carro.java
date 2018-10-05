package operaciones_movil.com.tallercarros;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class adapter_carro extends BaseAdapter {
    private Context contexto;
    private ArrayList<Carro> carros;
    private Resources res;

    public adapter_carro(Context contexto, ArrayList<Carro> carros) {
        this.contexto = contexto;
        this.carros = carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int i) {
        return carros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //DEFINIENDO VARIABLES A UTILIZAR
        res = contexto.getResources();
        View v = view;
        String[] modelo_string;
        String[] marca_string;
        String[] color_string;
        //Creamos el objeto para modificar la vista
        LayoutInflater inf = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.item_list,null);

        //Creamos Objeto persona
        Carro p = carros.get(i);

        //ELEMENTO DE LA VISTA
        ImageView foto = (ImageView)v.findViewById(R.id.imgfoto);
        TextView placa = (TextView)v.findViewById(R.id.lblplaca);
        TextView marca = (TextView)v.findViewById(R.id.lblmarca);
        TextView modelo = (TextView)v.findViewById(R.id.lblmodelo);
        TextView color = (TextView)v.findViewById(R.id.lblcolor);
        TextView precio = (TextView)v.findViewById(R.id.lblprecio);

        //setear imagen
        foto.setImageDrawable(ResourcesCompat.getDrawable(res,p.getFoto(),null));

        //setear datos
        modelo_string = res.getStringArray(R.array.array_madelo);
        marca_string = res.getStringArray(R.array.array_marca);
        color_string = res.getStringArray(R.array.array_color);
        placa.setText(p.getPlaca());
        precio.setText(p.getPrecio() + "");
        modelo.setText(modelo_string[p.getModelo()]);
        color.setText(color_string[p.getColor()]);
        marca.setText(marca_string[p.getMarca()]);

        return v;
    }
}
