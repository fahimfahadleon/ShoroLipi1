package com.example.shorolipi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer sound;


    ImageView ka,kha,ga,gha,ungo,ca,cha,ja,jha,ingo,ta,tha,da,dha,mordhanno,tta,ttha,dda,ddha,
            dontanno,po,pho,bo,vo,mo,ontojjo,ra,la,talbosso,moddhanso,dontosso,ho,rro,rrho,ontosto,hosento,onessor,bisargo,condrobindu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ka=findViewById(R.id.ban_ko);
        kha=findViewById(R.id.ban_kho);
        ga=findViewById(R.id.ban_go);
        gha=findViewById(R.id.ban_gho);
        ungo=findViewById(R.id.ban_ungo);
        ca=findViewById(R.id.ban_ca);
        cha=findViewById(R.id.ban_cha);
        ja=findViewById(R.id.ban_jo);
        jha=findViewById(R.id.ban_jha);
        ingo=findViewById(R.id.ban_ingo);
        ta=findViewById(R.id.ban_ta);
        tha=findViewById(R.id.ban_tha);
        da=findViewById(R.id.ban_da);
        dha=findViewById(R.id.ban_dha);
        mordhanno=findViewById(R.id.ban_mordhanno);
        tta=findViewById(R.id.ban_tta);
        ttha=findViewById(R.id.ban_ttha);
        dda=findViewById(R.id.ban_dda);
        ddha=findViewById(R.id.ban_ddha);
        dontanno=findViewById(R.id.ban_dontanno);
        po=findViewById(R.id.ban_po);
        pho=findViewById(R.id.ban_pho);
        bo=findViewById(R.id.ban_bo);
        vo=findViewById(R.id.ban_bho);
        mo=findViewById(R.id.ban_mo);
        ontojjo=findViewById(R.id.ban_ontorjo);
        ra=findViewById(R.id.ban_ro);
        la=findViewById(R.id.ban_lo);
        talbosso=findViewById(R.id.ban_talbosso);
        moddhanso=findViewById(R.id.ban_mordhansho);
        dontosso=findViewById(R.id.ban_dontosso);
        ho=findViewById(R.id.ban_ho);
        rro=findViewById(R.id.ban_rro);
        rrho=findViewById(R.id.ban_rrho);
        hosento=findViewById(R.id.ban_hosento);
        onessor=findViewById(R.id.ban_onessor);
        bisargo=findViewById(R.id.ban_bisargo);
        condrobindu=findViewById(R.id.ban_condrobindu);


        ka.setOnClickListener(this);
        kha.setOnClickListener(this);
        ga.setOnClickListener(this);
        gha.setOnClickListener(this);
        ungo.setOnClickListener(this);
        ca.setOnClickListener(this);
        cha.setOnClickListener(this);
        ja.setOnClickListener(this);
        jha.setOnClickListener(this);
        ingo.setOnClickListener(this);
        ta.setOnClickListener(this);
        tha.setOnClickListener(this);
        da.setOnClickListener(this);
        dha.setOnClickListener(this);
        mordhanno.setOnClickListener(this);
        tta.setOnClickListener(this);
        ttha.setOnClickListener(this);
        dda.setOnClickListener(this);
        ddha.setOnClickListener(this);
        dontanno.setOnClickListener(this);
        po.setOnClickListener(this);
        pho.setOnClickListener(this);
        bo.setOnClickListener(this);
        vo.setOnClickListener(this);
        mo.setOnClickListener(this);
        ontojjo.setOnClickListener(this);
        ra.setOnClickListener(this);
        la.setOnClickListener(this);
        talbosso.setOnClickListener(this);
        moddhanso.setOnClickListener(this);
        dontosso.setOnClickListener(this);
        ho.setOnClickListener(this);
        rro.setOnClickListener(this);
        rrho.setOnClickListener(this);
        ontosto.setOnClickListener(this);
        hosento.setOnClickListener(this);
        onessor.setOnClickListener(this);
        bisargo.setOnClickListener(this);
        condrobindu.setOnClickListener(this);


        sound=MediaPlayer.create(this,R.raw.ojogor);
        ojogor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();
            }
        });

        sound2=MediaPlayer.create(this,R.raw.b_1);
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound2.start();
            }
        });

        sound3=MediaPlayer.create(this,R.raw.b_2);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound3.start();
            }
        });

        sound4=MediaPlayer.create(this,R.raw.am);
        aam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound4.start();
            }
        });
    }


    @Override
    public void onClick(View v) {

        MediaPlayer mediaPlayer;

        if(v.equals(ka)){

        }else if(v.equals(kha)){

        }else if(v.equals(ga)){

        }else if(v.equals(gha)){

        }else if(v.equals(ungo)){

        }else if(v.equals(ca)){

        }else if(v.equals(cha)){

        }else if(v.equals(ja)){

        }else if(v.equals(jha)){

        }else if(v.equals(ingo)){

        }else if(v.equals(ta)){

        }else if(v.equals(tha)){

        }else if(v.equals(da)){

        }else if(v.equals(dha)){

        }else if(v.equals(mordhanno)){

        }else if(v.equals(tta)){

        }else if(v.equals(ttha)){

        }else if(v.equals(dda)){

        }else if(v.equals(ddha)){

        }else if(v.equals(dontanno)){

        }else if(v.equals(po)){

        }else if(v.equals(pho)){

        }else if(v.equals(bo)){

        }else if(v.equals(vo)){

        }else if(v.equals(mo)){

        }else if(v.equals(ontojjo)){

        }else if(v.equals(ra)){

        }else if(v.equals(la)){

        }else if(v.equals(talbosso)){

        }else if(v.equals(moddhanso)){

        }else if(v.equals(dontosso)){

        }else if(v.equals(ho)){

        }else if(v.equals(rro)){

        }else if(v.equals(rrho)){

        }else if(v.equals(ontosto)){

        }else if(v.equals(hosento)){

        }else if(v.equals(onessor)){

        }else if(v.equals(bisargo)){

        }else if(v.equals(condrobindu)){

        }
    }
}
