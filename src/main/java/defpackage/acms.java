package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acms */
public final class acms extends nf {
    private acmu Z;
    public acmt a;
    private ImageView aa;
    private TextView ab;
    private ProgressBar ac;
    private Button b;
    private ImageView c;

    public final void a(Activity activity) {
        super.a(activity);
        if (activity instanceof acmt) {
            this.a = (acmt) activity;
            return;
        }
        String obj = activity.toString();
        String simpleName = acmt.class.getSimpleName();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 16) + simpleName.length());
        stringBuilder.append(obj);
        stringBuilder.append(" must implement ");
        stringBuilder.append(simpleName);
        throw new ClassCastException(stringBuilder.toString());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = p().getLayoutInflater().inflate(R.layout.lc_error_state_fragment, viewGroup, false);
        this.Z = (acmu) this.j.getSerializable("state");
        this.b = (Button) inflate.findViewById(R.id.action_button);
        this.c = (ImageView) inflate.findViewById(R.id.bitmap_view);
        this.aa = (ImageView) inflate.findViewById(R.id.error_icon);
        this.ab = (TextView) inflate.findViewById(R.id.error_message_text);
        this.ac = (ProgressBar) inflate.findViewById(R.id.spinner);
        this.c.setBackground(q().getDrawable(R.color.lc_black_20));
        this.b.setOnClickListener(new acmr(this));
        int ordinal = this.Z.ordinal();
        if (ordinal == 0) {
            this.b.setVisibility(8);
            this.ac.setVisibility(8);
            this.aa.setVisibility(0);
            this.aa.setImageResource(R.drawable.quantum_ic_cloud_off_white_48);
            this.ab.setVisibility(0);
            this.ab.setText(R.string.lc_error_state_no_internet);
        } else if (ordinal == 1) {
            this.b.setVisibility(8);
            this.ac.setVisibility(0);
            this.aa.setVisibility(8);
            this.ab.setVisibility(0);
            this.ab.setText(R.string.lc_error_state_reconnecting);
        } else if (ordinal == 2) {
            this.ac.setVisibility(8);
            this.b.setVisibility(0);
            this.b.setText(17039370);
            this.aa.setVisibility(0);
            this.aa.setImageResource(R.drawable.quantum_ic_cloud_off_white_48);
            this.ab.setVisibility(0);
            this.ab.setText(R.string.lc_error_state_connection_failed);
        } else if (ordinal == 3) {
            this.b.setVisibility(0);
            this.b.setText(17039370);
            this.aa.setVisibility(0);
            this.aa.setImageResource(R.drawable.ic_sad_face);
            this.ac.setVisibility(8);
            this.ab.setVisibility(0);
            this.ab.setText(this.j.getString("message"));
        } else {
            throw new IllegalStateException("Unknown error state");
        }
        return inflate;
    }
}
