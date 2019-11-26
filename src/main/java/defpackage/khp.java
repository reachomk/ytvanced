package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: khp */
public final class khp extends fan {
    private final Context a;

    public khp(ViewStub viewStub, Context context) {
        super(viewStub);
        this.a = context;
    }

    public khp(ImageView imageView, Context context) {
        super((View) imageView);
        this.a = context;
    }

    public final void a(apdv apdv) {
        if (apdv != null) {
            ImageView imageView = (ImageView) b();
            imageView.setVisibility(0);
            awnx a = awnx.a(apdv.b);
            if (a == null) {
                a = awnx.PRIVATE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                imageView.setImageResource(R.drawable.ic_privacy_private);
                imageView.setContentDescription(this.a.getString(R.string.video_privacy_private_description));
                return;
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    imageView.setImageResource(R.drawable.ic_privacy_unlisted);
                    imageView.setContentDescription(this.a.getString(R.string.video_privacy_unlisted_description));
                }
                return;
            } else {
                imageView.setImageResource(R.drawable.ic_privacy_public);
                imageView.setContentDescription(this.a.getString(R.string.video_privacy_public_description));
                return;
            }
        }
        if (this.e) {
            this.f.setVisibility(8);
        }
    }
}
