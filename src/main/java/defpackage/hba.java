package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PreviewSuperStickerCommandOuterClass$PreviewSuperStickerCommand;
import java.util.Map;

/* renamed from: hba */
public final class hba implements aaap {
    private final hau a;

    public hba(hau hau) {
        this.a = hau;
    }

    public final void a(apxu apxu, Map map) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(PreviewSuperStickerCommandOuterClass$PreviewSuperStickerCommand.previewSuperStickerCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                axak axak;
                access$000 = anxl.checkIsLite(PreviewSuperStickerCommandOuterClass$PreviewSuperStickerCommand.previewSuperStickerCommand);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                PreviewSuperStickerCommandOuterClass$PreviewSuperStickerCommand previewSuperStickerCommandOuterClass$PreviewSuperStickerCommand = (PreviewSuperStickerCommandOuterClass$PreviewSuperStickerCommand) b;
                arml arml = null;
                if ((previewSuperStickerCommandOuterClass$PreviewSuperStickerCommand.a & 1) != 0) {
                    axak = previewSuperStickerCommandOuterClass$PreviewSuperStickerCommand.b;
                    if (axak == null) {
                        axak = axak.a;
                    }
                } else {
                    axak = null;
                }
                ajzw a = ajzv.a(axak);
                if (a != null) {
                    axza axza = (axza) ajzv.a(a, axza.class);
                    if (axza != null) {
                        hau hau = this.a;
                        Context context = hau.a;
                        if (context instanceof nn) {
                            absq absq = hau.k;
                            if (absq == null || !absq.Z) {
                                arml arml2;
                                nt f = ((nn) context).f();
                                hau.k = new absq();
                                abvi abvi = hau.f;
                                abvi.f = View.inflate(abvi.a, R.layout.live_chat_sticker_preview, null);
                                TextView textView = (TextView) abvi.f.findViewById(R.id.preview_title);
                                TextView textView2 = (TextView) abvi.f.findViewById(R.id.sticker_pin_duration);
                                ViewGroup viewGroup = (ViewGroup) abvi.f.findViewById(R.id.paid_sticker);
                                abvi.g = (TextView) abvi.f.findViewById(R.id.error_message);
                                TextView textView3 = (TextView) abvi.f.findViewById(R.id.send_sticker_button);
                                if ((axza.a & 2) != 0) {
                                    arml2 = axza.c;
                                    if (arml2 == null) {
                                        arml2 = arml.f;
                                    }
                                } else {
                                    arml2 = null;
                                }
                                textView.setText(ajqy.a(arml2));
                                if ((axza.a & 4) != 0) {
                                    akyy a2 = abvi.b.a(textView3);
                                    axak axak2 = axza.d;
                                    if (axak2 == null) {
                                        axak2 = axak.a;
                                    }
                                    aphg aphg = (aphg) ajzv.a(ajzv.a(axak2), aphg.class);
                                    abvi.c.b(new acvs(aphg.r));
                                    a2.a(aphg, abvi.c, amur.a("YpcTransactionListener", abvi.e));
                                    a2.c = abvi;
                                }
                                if ((axza.a & 16) != 0) {
                                    arml = axza.f;
                                    if (arml == null) {
                                        arml = arml.f;
                                    }
                                }
                                textView2.setText(ajqy.a(arml));
                                if ((axza.a & 1) != 0) {
                                    axak = axza.b;
                                    if (axak == null) {
                                        axak = axak.a;
                                    }
                                    b = (aufj) ajzv.a(ajzv.a(axak), aufj.class);
                                    akot a3 = akoz.a((akpb) abvi.d.get(), b, viewGroup);
                                    if (a3 != null) {
                                        a3.a_(new akor(), b);
                                        viewGroup.addView(a3.K_());
                                    }
                                }
                                absq absq2 = hau.k;
                                absq2.aa = hau.f.f;
                                absq2.Z = true;
                                absq2.a(f, "tag_sticker_preview_fragment");
                            }
                        }
                    }
                }
            }
        }
    }
}
