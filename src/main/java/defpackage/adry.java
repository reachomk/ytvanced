package defpackage;

import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: adry */
final class adry implements Runnable {
    private final ajis a;
    private final /* synthetic */ adro b;

    adry(adro adro, ajis ajis) {
        this.b = adro;
        this.a = ajis;
    }

    public final void run() {
        adro adro = this.b;
        adro.ab = null;
        if (adro.O()) {
            adro = this.b;
            ajis ajis = this.a;
            if (adro.D.m()) {
                adja adja = new adja();
                String str = "videoId";
                if (ajis == null || ajis.a() || ajis.k) {
                    adja.a(str, adro.D.a());
                } else {
                    Object obj;
                    adja.a("format", String.valueOf(ajis.e));
                    adja.a("languageCode", ajis.a);
                    adja.a("languageName", ajis.b);
                    adja.a("sourceLanguageCode", ajis.a);
                    adja.a("trackName", ajis.c);
                    adja.a("vss_id", ajis.h);
                    adja.a(str, adro.D.a());
                    float b = adro.q.b();
                    ajji c = adro.q.c();
                    HashMap hashMap = new HashMap();
                    hashMap.put("background", ajji.a(c.a));
                    hashMap.put("backgroundOpacity", ajji.b(c.a));
                    hashMap.put("color", ajji.a(c.e));
                    hashMap.put("textOpacity", ajji.b(c.e));
                    hashMap.put("fontSizeRelative", String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(b)}));
                    hashMap.put("windowColor", ajji.a(c.b));
                    hashMap.put("windowOpacity", ajji.b(c.b));
                    int i = c.d;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                obj = "raised";
                            } else if (i == 4) {
                                obj = "depressed";
                            } else if (i != 5) {
                                obj = "none";
                            }
                        }
                        obj = "dropShadow";
                    } else {
                        obj = "uniform";
                    }
                    hashMap.put("charEdgeStyle", obj);
                    switch (c.f) {
                        case 0:
                            obj = "monoSerif";
                            break;
                        case 1:
                            obj = "propSerif";
                            break;
                        case 2:
                            obj = "monoSans";
                            break;
                        case 3:
                            obj = "propSans";
                            break;
                        case 4:
                            obj = "casual";
                            break;
                        case 5:
                            obj = "cursive";
                            break;
                        case 6:
                            obj = "smallCaps";
                            break;
                        default:
                            obj = "";
                            break;
                    }
                    hashMap.put("fontFamilyOption", obj);
                    adja.a("style", new JSONObject(hashMap).toString());
                }
                adro.a(adiv.SET_SUBTITLES_TRACK, adja);
            }
        }
    }
}
