package operaciones_movil.com.tallercarros;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class listado_list extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Carro> carros;
    private Context contexto;
    private adapter_carro adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_list_view);

        lista = (ListView) findViewById(R.id.list_personalizado);
        contexto = this .getApplicationContext();
        carros = datos.obtenerCarros();
        adapter = new adapter_carro(contexto,carros);
        lista.setAdapter(adapter);
    }
}
