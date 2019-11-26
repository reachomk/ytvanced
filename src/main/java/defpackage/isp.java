package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* renamed from: isp */
public final class isp extends DialogFragment {
    public Activity a;
    public ProgressBar b;
    public ImageView c;
    private RelativeLayout d;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getActivity();
        Handler handler = new Handler();
        this.d = (RelativeLayout) this.a.getLayoutInflater().inflate(R.layout.voz_loading_dialog, (ViewGroup) this.a.findViewById(16908290), false);
        setStyle(2, 16973934);
        this.c = (ImageView) this.d.findViewById(R.id.back_button);
        this.b = (ProgressBar) this.d.findViewById(R.id.loading_view);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        aeg aeg = new aeg(getActivity());
        aeg.a(this.d);
        aeh a = aeg.a();
        a.getWindow().requestFeature(1);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setOnClickListener(new iso(this));
        }
        return a;
    }

    public final void onStart() {
        super.onStart();
        if (getDialog() != null) {
            getDialog().getWindow().setLayout(-1, -1);
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        dismissAllowingStateLoss();
    }
}
