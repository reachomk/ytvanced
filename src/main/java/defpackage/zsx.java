package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand;
import com.google.protos.youtube.api.innertube.GamingMultipleAccountLinkDialogRendererOuterClass;
import java.util.Map;

/* renamed from: zsx */
public final class zsx implements aaap {
    public final Context a;
    private final akkq b;
    private final aaas c;
    private final acvx d;

    public zsx(Context context, akkq akkq, aaas aaas, acvx acvx) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = acvx;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        arpt arpt;
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.gamingMultipleAccountLinkDialogCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand = (GamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand) obj;
        if ((gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.a & 1) != 0) {
            anxp anxp = gamingMultipleAccountLinkDialogCommandOuterClass$GamingMultipleAccountLinkDialogCommand.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(GamingMultipleAccountLinkDialogRendererOuterClass.gamingMultipleAccountLinkDialogRenderer);
            anxp.a(access$0002);
            obj = anxp.h.b(access$0002.d);
            if (obj == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(obj);
            }
            arpt = (arpt) obj;
        } else {
            arpt = null;
        }
        if (arpt != null) {
            zsw zsw = new zsw(this, this.a, this.c, this.d, map);
            LayoutInflater from = LayoutInflater.from(zsw.b);
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.multiple_account_link_dialog, null);
            for (arpv arpv : arpt.c) {
                if ((arpv.a & 1) != 0) {
                    arpx arpx = arpv.b;
                    if (arpx == null) {
                        arpx = arpx.f;
                    }
                    View inflate = from.inflate(R.layout.multiple_account_link_dialog_row, null);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.third_party_avatar);
                    aygk aygk = arpx.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    zsw.a.b.b(aklb.b(aygk, zsw.a.a.getResources().getDimensionPixelSize(R.dimen.third_party_avatar_size)), new zsz(zsw, imageView));
                    TextView textView = (TextView) inflate.findViewById(R.id.third_party_name);
                    arml arml = arpx.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    xpr.a(textView, ajqy.a(arml));
                    textView = (TextView) inflate.findViewById(R.id.connection_status);
                    arml = arpx.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    xpr.a(textView, ajqy.a(arml));
                    akoj akoj = new akoj(zsw.c, inflate, new ztb(zsw));
                    acvx acvx = zsw.d;
                    apxu apxu2 = arpx.d;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    akoj.a(acvx, apxu2, zsw.e);
                    viewGroup.addView(inflate);
                }
            }
            Builder view = new Builder(zsw.b).setView(viewGroup);
            arml arml2 = arpt.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            AlertDialog create = view.setTitle(ajqy.a(arml2)).setPositiveButton(null, null).setNegativeButton(null, null).create();
            create.show();
            zsw.f = create;
            this.d.a(acwl.q, apxu, null);
        }
    }
}
