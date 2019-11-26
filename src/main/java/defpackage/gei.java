package defpackage;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.support.design.textfield.TextInputLayout;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: gei */
public final class gei extends nd implements OnKeyListener, OnClickListener {
    public akvp Z;
    public nt aa;
    public nt ab;
    public akkq ac;
    public Button ad;
    public EditText ae;
    public TextInputLayout af;
    public nt ag;
    private awww ah;
    private String ai;
    private gej aj;
    private ImageView ak;

    public static gei a(awww awww, String str, String str2) {
        gei gei = new gei();
        Bundle bundle = new Bundle();
        bundle.putByteArray("renderer", awww.toByteArray());
        if (str != null) {
            bundle.putString("thumbnail", str);
        }
        String str3 = "reelCreationFragmentManager";
        if (str2 != null) {
            bundle.putString("playlist", str2);
            bundle.putBoolean(str3, false);
        } else {
            bundle.putBoolean(str3, true);
        }
        gei.f(bundle);
        return gei;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gem) xtx.a(gem.class, this.y, p())).o().a(this);
        a(2, (int) R.style.f313ReelTheme.NoActionBar.FullScreen.Light);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d5  */
    public final android.view.View a(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
        r7 = this;
        r10 = "reelCreationFragmentManager";
        r0 = "playlist";
        r1 = "thumbnail";
        r2 = "renderer";
        r3 = r7.j;
        r4 = 0;
        if (r3 != 0) goto L_0x000f;
    L_0x000d:
        r0 = r4;
        goto L_0x0054;
    L_0x000f:
        r5 = r3.containsKey(r2);	 Catch:{ anyg -> 0x000d }
        if (r5 == 0) goto L_0x0027;
    L_0x0015:
        r2 = r3.getByteArray(r2);	 Catch:{ anyg -> 0x000d }
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x000d }
        r6 = defpackage.awww.g;	 Catch:{ anyg -> 0x000d }
        r2 = defpackage.anxl.parseFrom(r6, r2, r5);	 Catch:{ anyg -> 0x000d }
        r2 = (defpackage.awww) r2;	 Catch:{ anyg -> 0x000d }
        r7.ah = r2;	 Catch:{ anyg -> 0x000d }
    L_0x0027:
        r2 = r3.containsKey(r1);	 Catch:{ anyg -> 0x000d }
        if (r2 == 0) goto L_0x0033;
    L_0x002d:
        r1 = r3.getString(r1);	 Catch:{ anyg -> 0x000d }
        r7.ai = r1;	 Catch:{ anyg -> 0x000d }
    L_0x0033:
        r1 = r3.containsKey(r0);	 Catch:{ anyg -> 0x000d }
        if (r1 == 0) goto L_0x003e;
    L_0x0039:
        r0 = r3.getString(r0);	 Catch:{ anyg -> 0x000d }
        goto L_0x003f;
    L_0x003e:
        r0 = r4;
    L_0x003f:
        r1 = r3.containsKey(r10);	 Catch:{ anyg -> 0x0053 }
        if (r1 == 0) goto L_0x0054;
    L_0x0045:
        r10 = r3.getBoolean(r10);	 Catch:{ anyg -> 0x0053 }
        if (r10 == 0) goto L_0x004e;
    L_0x004b:
        r10 = r7.aa;	 Catch:{ anyg -> 0x0053 }
        goto L_0x0050;
    L_0x004e:
        r10 = r7.ab;	 Catch:{ anyg -> 0x0053 }
    L_0x0050:
        r7.ag = r10;	 Catch:{ anyg -> 0x0053 }
        goto L_0x0054;
    L_0x0054:
        r10 = 2131035236; // 0x7f050464 float:1.7681012E38 double:1.0528713E-314;
        r1 = 0;
        r8 = r8.inflate(r10, r9, r1);
        r9 = 2131758161; // 0x7f100c51 float:1.9147278E38 double:1.0532284726E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        r7.ak = r9;
        r9 = r7.ah;
        r9 = r9.b;
        if (r9 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0070;
    L_0x006e:
        r9 = defpackage.axak.a;
    L_0x0070:
        r10 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r10 = r10.d;
        r9 = r9.a(r10);
        if (r9 != 0) goto L_0x0084;
    L_0x0083:
        goto L_0x00ea;
    L_0x0084:
        r9 = r7.ah;
        r9 = r9.b;
        if (r9 == 0) goto L_0x008b;
    L_0x008a:
        goto L_0x008d;
    L_0x008b:
        r9 = defpackage.axak.a;
    L_0x008d:
        r10 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r2 = r10.d;
        r9 = r9.b(r2);
        if (r9 != 0) goto L_0x00a3;
    L_0x00a0:
        r9 = r10.b;
        goto L_0x00a7;
    L_0x00a3:
        r9 = r10.a(r9);
    L_0x00a7:
        r9 = (defpackage.aphg) r9;
        r10 = r7.Z;
        r2 = r9.e;
        if (r2 != 0) goto L_0x00b1;
    L_0x00af:
        r2 = defpackage.arwf.c;
    L_0x00b1:
        r2 = r2.b;
        r2 = defpackage.arwh.a(r2);
        if (r2 != 0) goto L_0x00bb;
    L_0x00b9:
        r2 = defpackage.arwh.UNKNOWN;
    L_0x00bb:
        r10 = r10.a(r2);
        r2 = r7.ak;
        r2.setImageResource(r10);
        r10 = r7.ak;
        r9 = r9.p;
        if (r9 != 0) goto L_0x00cc;
    L_0x00ca:
        r9 = defpackage.aodv.c;
    L_0x00cc:
        r9 = r9.b;
        r10.setContentDescription(r9);
        r9 = r7.ak;
        r9.setOnClickListener(r7);
        r9 = r7.ak;
        r10 = r7.M_();
        r10 = r10.getResources();
        r2 = 2131559065; // 0x7f0d0299 float:1.8743464E38 double:1.053130106E-314;
        r10 = r10.getColor(r2);
        r9.setColorFilter(r10);
    L_0x00ea:
        r9 = 2131758167; // 0x7f100c57 float:1.914729E38 double:1.0532284756E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.Button) r9;
        r7.ad = r9;
        r9 = r7.ah;
        r9 = r9.c;
        if (r9 != 0) goto L_0x00fd;
    L_0x00fb:
        r9 = defpackage.axak.a;
    L_0x00fd:
        r10 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r10 = r10.d;
        r9 = r9.a(r10);
        if (r9 != 0) goto L_0x0111;
    L_0x0110:
        goto L_0x015e;
    L_0x0111:
        r9 = r7.ah;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0119;
    L_0x0117:
        r9 = defpackage.axak.a;
    L_0x0119:
        r10 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r9.a(r10);
        r9 = r9.h;
        r2 = r10.d;
        r9 = r9.b(r2);
        if (r9 != 0) goto L_0x012f;
    L_0x012c:
        r9 = r10.b;
        goto L_0x0133;
    L_0x012f:
        r9 = r10.a(r9);
    L_0x0133:
        r9 = (defpackage.aphg) r9;
        r10 = r7.ad;
        r2 = r9.a;
        r2 = r2 & 128;
        if (r2 == 0) goto L_0x0144;
    L_0x013d:
        r2 = r9.g;
        if (r2 != 0) goto L_0x0145;
    L_0x0141:
        r2 = defpackage.arml.f;
        goto L_0x0145;
    L_0x0144:
        r2 = r4;
    L_0x0145:
        r2 = defpackage.ajqy.a(r2);
        r10.setText(r2);
        r10 = r7.ad;
        r9 = r9.p;
        if (r9 != 0) goto L_0x0154;
    L_0x0152:
        r9 = defpackage.aodv.c;
    L_0x0154:
        r9 = r9.b;
        r10.setContentDescription(r9);
        r9 = r7.ad;
        r9.setOnClickListener(r7);
    L_0x015e:
        r9 = 2131758164; // 0x7f100c54 float:1.9147284E38 double:1.053228474E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        r10 = r7.ai;
        if (r10 == 0) goto L_0x0182;
    L_0x016b:
        r1 = new java.io.File;
        r1.<init>(r10);
        r10 = r1.exists();
        if (r10 == 0) goto L_0x01a6;
    L_0x0176:
        r10 = r7.ai;
        r10 = android.graphics.BitmapFactory.decodeFile(r10);
        if (r10 == 0) goto L_0x01a6;
    L_0x017e:
        r9.setImageBitmap(r10);
        goto L_0x01a6;
    L_0x0182:
        r10 = r7.ah;
        r10 = r10.a;
        r10 = r10 & 16;
        if (r10 == 0) goto L_0x01a6;
    L_0x018a:
        r10 = new akle;
        r2 = new akkj;
        r3 = r7.ac;
        r2.<init>(r3);
        r3 = new xna;
        r3.<init>();
        r10.<init>(r2, r3, r9, r1);
        r9 = r7.ah;
        r9 = r9.f;
        if (r9 != 0) goto L_0x01a3;
    L_0x01a1:
        r9 = defpackage.aygk.f;
    L_0x01a3:
        r10.a(r9);
    L_0x01a6:
        r9 = 2131758165; // 0x7f100c55 float:1.9147286E38 double:1.0532284746E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.support.design.textfield.TextInputLayout) r9;
        r7.af = r9;
        r9 = 2131758166; // 0x7f100c56 float:1.9147288E38 double:1.053228475E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.EditText) r9;
        r7.ae = r9;
        r9 = r7.ae;
        r10 = r7.ah;
        r1 = r10.a;
        r2 = 4;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x01cc;
    L_0x01c6:
        r4 = r10.d;
        if (r4 != 0) goto L_0x01cc;
    L_0x01ca:
        r4 = defpackage.arml.f;
    L_0x01cc:
        r10 = defpackage.ajqy.a(r4);
        r9.setHint(r10);
        if (r0 == 0) goto L_0x01da;
    L_0x01d5:
        r9 = r7.ae;
        r9.setText(r0);
    L_0x01da:
        r9 = r7.ae;
        r9.requestFocus();
        r9 = r7.ae;
        r10 = new gek;
        r10.<init>(r7);
        r9.addTextChangedListener(r10);
        r9 = r7.c;
        r9 = r9.getWindow();
        r9.setSoftInputMode(r2);
        r9 = r7.c;
        r9.setOnKeyListener(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gei.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        W();
        return true;
    }

    public final void a(gej gej) {
        this.aj = (gej) amqw.a((Object) gej);
    }

    private final void W() {
        if (TextUtils.isEmpty(this.ae.getText().toString())) {
            nt ntVar = this.ag;
            if (ntVar != null) {
                ntVar.a().a(this).a();
            } else {
                xtl.c("fragmentManager is null");
            }
            xpr.a(this.ae);
            return;
        }
        new Builder(p()).setTitle(a((int) R.string.reel_discard_editor_changes_title)).setMessage(a((int) R.string.reel_discard_editor_changes_description)).setPositiveButton(R.string.reel_discard_editor_changes_dialog_discard_button_text, new gel(this)).setNegativeButton(R.string.reel_discard_editor_changes_dialog_cancel_button_text, null).show();
    }

    public final void onClick(View view) {
        if (view == this.ak) {
            W();
            return;
        }
        View view2 = this.ad;
        if (view == view2 && view2.isEnabled()) {
            nt ntVar = this.ag;
            if (ntVar != null) {
                ntVar.a().a(this).a();
            } else {
                xtl.c("fragmentManager is null");
            }
            gej gej = this.aj;
            if (gej != null) {
                gej.a(this.ae.getText().toString().trim());
            }
            xpr.a(this.ae);
        }
    }
}
