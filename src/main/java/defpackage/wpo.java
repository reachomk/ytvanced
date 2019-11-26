package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.YpcUpgradeDialogRendererOuterClass;
import java.util.HashMap;

/* renamed from: wpo */
public final class wpo extends nd implements wqt {
    public wpk Z;
    public boolean aa;
    public wri ab;
    public acwa ac;
    public aaas ad;
    public aamj ae;
    private Context af;
    private atqe ag;
    private OnDismissListener ah;

    public final void a(Context context) {
        super.a(context);
        this.af = context;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wpt) xse.b(this.af)).a(this);
        String str = "get_cart_response";
        if (this.j.containsKey(str)) {
            this.ag = (atqe) this.ae.a(this.j.getByteArray(str), atqe.o);
        }
        a(0, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        amqw.a((Object) layoutInflater);
        if (this.ag == null) {
            dismiss();
            wpk wpk = this.Z;
            if (wpk != null && this.c == null) {
                wpk.a(null);
            }
            return null;
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand;
        this.c.setCanceledOnTouchOutside(true);
        View inflate = layoutInflater.inflate(R.layout.upgrade_dialog_wrapper, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.upgrade_dialog_view);
        atqe atqe = this.ag;
        anxp anxp = atqe.b == 15 ? (axak) atqe.c : axak.a;
        anxr access$000 = anxl.checkIsLite(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        anxo anxo = (azpu) ((anxo) ((azpt) b).toBuilder());
        azpt azpt = (azpt) ((anxl) anxo.build());
        anxp anxp2 = azpt.e;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp2.a(access$0002);
        Object b2 = anxp2.h.b(access$0002.d);
        if (b2 == null) {
            b2 = access$0002.b;
        } else {
            b2 = access$0002.a(b2);
        }
        anxp2 = ((aphg) b2).l;
        if (anxp2 == null) {
            anxp2 = apxu.d;
        }
        access$0002 = anxl.checkIsLite(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
        anxp2.a(access$0002);
        if (anxp2.h.a(access$0002.d)) {
            anxp anxp3 = azpt.e;
            if (anxp3 == null) {
                anxp3 = axak.a;
            }
            anxr access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp3.a(access$0003);
            Object b3 = anxp3.h.b(access$0003.d);
            if (b3 == null) {
                b3 = access$0003.b;
            } else {
                b3 = access$0003.a(b3);
            }
            anxp3 = ((aphg) b3).l;
            if (anxp3 == null) {
                anxp3 = apxu.d;
            }
            access$0003 = anxl.checkIsLite(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
            anxp3.a(access$0003);
            b3 = anxp3.h.b(access$0003.d);
            if (b3 == null) {
                b3 = access$0003.b;
            } else {
                b3 = access$0003.a(b3);
            }
            inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) b3;
        } else {
            inlineAuthCommandOuterClass$InlineAuthCommand = null;
        }
        HashMap hashMap = new HashMap();
        if (inlineAuthCommandOuterClass$InlineAuthCommand != null) {
            axaj axaj;
            anxl anxl;
            this.aa = true;
            aaas aaas = this.ad;
            apxu apxu = inlineAuthCommandOuterClass$InlineAuthCommand.b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new wps(aaas, apxu, this.Z));
            arxw arxw = (arxw) ((anxo) inlineAuthCommandOuterClass$InlineAuthCommand.toBuilder());
            arxw.copyOnWrite();
            inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) arxw.instance;
            inlineAuthCommandOuterClass$InlineAuthCommand.b = null;
            inlineAuthCommandOuterClass$InlineAuthCommand.a &= -2;
            InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand2 = (InlineAuthCommandOuterClass$InlineAuthCommand) ((anxl) arxw.build());
            if ((((azpt) anxo.instance).a & 4) != 0) {
                axak a = anxo.a();
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                a.a(access$000);
                Object b4 = a.h.b(access$000.d);
                if (b4 == null) {
                    b4 = access$000.b;
                } else {
                    b4 = access$000.a(b4);
                }
                aphg aphg = (aphg) b4;
                anxl anxl2 = aphg.l;
                if (anxl2 == null) {
                    anxl2 = apxu.d;
                }
                apxx apxx = (apxx) ((anxo) anxl2.toBuilder());
                apxx.a(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand2);
                aphf aphf = (aphf) ((anxo) aphg.toBuilder());
                aphf.a((apxu) ((anxl) apxx.build()));
                aphg aphg2 = (aphg) ((anxl) aphf.build());
                axaj = (axaj) ((anxo) anxo.a().toBuilder());
                axaj.a(ButtonRendererOuterClass.buttonRenderer, aphg2);
                anxo.copyOnWrite();
                azpt azpt2 = (azpt) anxo.instance;
                azpt2.e = (axak) ((anxl) axaj.build());
                azpt2.a |= 4;
                anxl = (azpt) ((anxl) anxo.build());
            } else {
                anxl = (azpt) ((anxl) anxo.build());
            }
            anxo = (azpu) ((anxo) anxl.toBuilder());
            atqd atqd = (atqd) ((anxo) this.ag.toBuilder());
            atqe atqe2 = this.ag;
            axaj = (axaj) ((anxo) (atqe2.b == 15 ? (axak) atqe2.c : axak.a).toBuilder());
            axaj.a(YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer, (azpt) ((anxl) anxo.build()));
            atqd.copyOnWrite();
            atqe atqe3 = (atqe) atqd.instance;
            atqe3.c = (anxl) axaj.build();
            atqe3.b = 15;
            this.ag = (atqe) ((anxl) atqd.build());
        } else {
            this.aa = false;
            hashMap.put("YpcCompleteTransactionCallback", this);
        }
        wri wri = this.ab;
        wrh wrh = new wrh((Context) wri.a(this.af, 1), (aaas) wri.a((aaas) wri.a.get(), 2), (akzb) wri.a((akzb) wri.b.get(), 3), new wpr(this), new wpq(this), hashMap);
        frameLayout.addView(wrh.c);
        akor akor = new akor();
        akor.a(this.ac.t());
        this.ah = wrh;
        wrh.a_(akor, (azpt) ((anxl) anxo.build()));
        return inflate;
    }

    public final void a(akcf akcf) {
        dismiss();
        wpk wpk = this.Z;
        if (wpk != null) {
            wpk.a(akcf);
        }
    }

    public final void ac_() {
        wpk wpk = this.Z;
        if (wpk != null) {
            wpk.a(null);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        wpk wpk = this.Z;
        if (wpk != null) {
            wpk.b();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        OnDismissListener onDismissListener = this.ah;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
