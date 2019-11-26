package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;

/* renamed from: wto */
public final class wto {
    public final View a;
    public final View b;
    private final TextView c = ((TextView) this.a.findViewById(R.id.title));
    private final View d;

    public wto(Context context, aaas aaas, ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) {
        this.a = LayoutInflater.from(context).inflate(R.layout.webview_dialog_header_layout, null, false);
        TextView textView = this.c;
        arml arml = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.d;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        this.d = this.a.findViewById(R.id.information_button);
        axak axak = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.e;
        if (axak == null) {
            axak = axak.a;
        }
        aphg aphg = (aphg) ajzv.b(axak);
        if (aphg != null) {
            aodx aodx = aphg.q;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx = aphg.q;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                if ((aodv.a & 2) != 0) {
                    this.d.setContentDescription(aodv.b);
                }
            }
            this.d.setOnClickListener(new wtr(aaas, aphg));
            xpr.a(this.d, true);
        }
        this.b = this.a.findViewById(R.id.close_button);
    }
}
