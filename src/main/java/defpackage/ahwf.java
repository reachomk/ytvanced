package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: ahwf */
final /* synthetic */ class ahwf implements Runnable {
    private final ahwc a;
    private final awfw[] b;

    ahwf(ahwc ahwc, awfw[] awfwArr) {
        this.a = ahwc;
        this.b = awfwArr;
    }

    public final void run() {
        int size;
        ahwc ahwc = this.a;
        ArrayList arrayList = new ArrayList(size);
        for (awfw awfw : this.b) {
            ahwa ahwa = ahwc.h;
            Object obj = null;
            if (awfw == null) {
                xtl.c("Cannot create view because the renderer was null");
            } else {
                int i = awfw.a;
                aygk aygk;
                aygk aygk2;
                arml arml;
                arml arml2;
                arml arml3;
                apxu apxu;
                TextView textView;
                if ((i & 1) != 0) {
                    arml arml4;
                    arej arej = awfw.b;
                    if (arej == null) {
                        arej = arej.m;
                    }
                    View b = ahwa.b(R.layout.vr_watch_next_video);
                    aygk = arej.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk2 = aygk;
                    arml = arej.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    arml2 = arml;
                    if ((arej.a & 32) != 0) {
                        arml = arej.f;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = arej.e;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    arml3 = arml;
                    apxu = arej.k;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    ahwa.a(b, aygk2, arml2, arml3, apxu);
                    textView = (TextView) b.findViewById(R.id.duration);
                    if ((arej.a & 512) != 0) {
                        arml4 = arej.j;
                        if (arml4 == null) {
                            arml4 = arml.f;
                        }
                    }
                    textView.setText(ajqy.a(arml4));
                    obj = b;
                } else if ((i & 2) == 0) {
                    xtl.c("Cannot create view because of unexpected renderer type.");
                } else {
                    areh areh = awfw.c;
                    if (areh == null) {
                        areh = areh.j;
                    }
                    obj = ahwa.b(R.layout.vr_watch_next_playlist);
                    aygk = areh.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk2 = aygk;
                    arml = areh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    arml2 = arml;
                    if ((areh.a & 64) != 0) {
                        arml = areh.f;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = areh.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    arml3 = arml;
                    apxu = areh.d;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    ahwa.a(obj, aygk2, arml2, arml3, apxu);
                    textView = (TextView) obj.findViewById(R.id.video_count);
                    arml arml5 = areh.h;
                    if (arml5 == null) {
                        arml5 = arml.f;
                    }
                    textView.setText(ajqy.a(arml5));
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ahpa ahpa = ahwc.j;
        if (ahpa != null) {
            if (ahpa.k != null) {
                size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ahpa.k.addView((View) arrayList.get(i2));
                }
            }
            ahwc.c();
        }
    }
}
