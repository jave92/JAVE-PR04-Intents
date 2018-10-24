package es.iessaladillo.pedrojoya.pr04.ui.avatar;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import es.iessaladillo.pedrojoya.pr04.R;
import es.iessaladillo.pedrojoya.pr04.utils.ResourcesUtils;

public class AvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        initViews();
    }

    private void initViews(){
        imgAvatar1 =
    }
    // DO NO TOUCH
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
