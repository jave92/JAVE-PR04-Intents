package es.iessaladillo.pedrojoya.pr04.ui.avatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import es.iessaladillo.pedrojoya.pr04.R;
import es.iessaladillo.pedrojoya.pr04.data.local.Database;
import es.iessaladillo.pedrojoya.pr04.data.local.model.Avatar;
import es.iessaladillo.pedrojoya.pr04.ui.main.MainActivity;
import es.iessaladillo.pedrojoya.pr04.utils.ResourcesUtils;

public class AvatarActivity extends AppCompatActivity {

    private static final String EXTRA_NOMBRE="nombre";
    private ImageView imgAvatar1,imgAvatar2,imgAvatar3,imgAvatar4,imgAvatar5,imgAvatar6;
    private TextView lblAvatar1,lblAvatar2,lblAvatar3,lblAvatar4,lblAvatar5,lblAvatar6;
    private List<Avatar> avatares;
    final String EXTRA_AVATAR = "EXTRA_AVATAR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        initViews();

        imgAvatar1.setImageResource(avatares.get(0).getImageResId());
        imgAvatar1.setTag(avatares.get(0).getImageResId());
        lblAvatar1.setText(avatares.get(0).getName());

        imgAvatar2.setImageResource(avatares.get(1).getImageResId());
        imgAvatar2.setTag(avatares.get(1).getImageResId());
        lblAvatar2.setText(avatares.get(1).getName());

        imgAvatar3.setImageResource(avatares.get(2).getImageResId());
        imgAvatar3.setTag(avatares.get(2).getImageResId());
        lblAvatar3.setText(avatares.get(2).getName());

        imgAvatar4.setImageResource(avatares.get(3).getImageResId());
        imgAvatar4.setTag(avatares.get(3).getImageResId());
        lblAvatar4.setText(avatares.get(3).getName());

        imgAvatar5.setImageResource(avatares.get(4).getImageResId());
        imgAvatar5.setTag(avatares.get(4).getImageResId());
        lblAvatar5.setText(avatares.get(4).getName());

        imgAvatar6.setImageResource(avatares.get(5).getImageResId());
        imgAvatar6.setTag(avatares.get(5).getImageResId());
        lblAvatar6.setText(avatares.get(5).getName());

        // NO SELECCIONAS EL AVATAR ACTUAL.
        // NO SE PUEDE SELECCIONAR NINGÚN AVATAR.
    }

    private void initViews(){
        imgAvatar1 = findViewById(R.id.imgAvatar1);
        imgAvatar2 = findViewById(R.id.imgAvatar2);
        imgAvatar3 = findViewById(R.id.imgAvatar3);
        imgAvatar4 = findViewById(R.id.imgAvatar4);
        imgAvatar5 = findViewById(R.id.imgAvatar5);
        imgAvatar6 = findViewById(R.id.imgAvatar6);
        lblAvatar1 = findViewById(R.id.lblAvatar1);
        lblAvatar2 = findViewById(R.id.lblAvatar1);
        lblAvatar3 = findViewById(R.id.lblAvatar1);
        lblAvatar4 = findViewById(R.id.lblAvatar1);
        lblAvatar5 = findViewById(R.id.lblAvatar1);
        lblAvatar6 = findViewById(R.id.lblAvatar1);
        avatares=Database.getInstance().queryAvatars();
    }
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.imgAvatar1:
                // COPY-PASTE. HAZ UN MÉTODO!!!
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(0));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar1:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(0));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.imgAvatar2:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(1));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar2:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(1));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.imgAvatar3:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(2));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar3:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(2));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.imgAvatar4:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(3));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar4:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(3));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.imgAvatar5:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(4));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar5:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(4));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.imgAvatar6:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(5));
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.lblAvatar6:
                intent = new Intent();
                intent.putExtra(EXTRA_AVATAR,avatares.get(5));
                setResult(RESULT_OK,intent);
                finish();
                break;
        }
    }

    // NO LLAMAS A ESTE MÉTODO PORQUE NO LLAMAS A LA ACTIVIDAD.
    public static void startForResult(MainActivity actividad, int requestCode, String nombre) {
        Intent intencion = new Intent(actividad, AvatarActivity.class);
        intencion.putExtra(EXTRA_NOMBRE, nombre);
        actividad.startActivityForResult(intencion, requestCode);
    }
    // DO NO TOUCH
    // NO SELECCIONAS EL AVATAR ACTUAL.
    private void selectImageView(ImageView imageView) {
        imageView.setAlpha(ResourcesUtils.getFloat(this, R.dimen.selected_image_alpha));
    }

    // DO NOT TOUCH
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
