package operaciones_movil.com.tallercarros;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class listado_list extends AppCompatActivity {
    private LinearLayout lista;
    private ArrayList<Carro> carros;
    private Context contexto;
    private adapter_carro adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_principal);

        lista = (LinearLayout) findViewById(R.id.list_personalizado);
        contexto = this .getApplicationContext();
        carros = datos.obtenerCarros();
        adapter = new adapter_carro(contexto,carros);
        lista.setAdapter(adapter);

    }
}
