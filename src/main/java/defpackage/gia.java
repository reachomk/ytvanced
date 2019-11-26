package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gia */
public final class gia {
    private final SharedPreferences a;

    public gia(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a(axak axak) {
        amqw.a((Object) axak);
        List<axak> a = a();
        for (axak axak2 : a) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
            axak2.a(access$000);
            if (axak2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.stickerRenderer);
                axak.a(access$000);
                if (axak.h.a(access$000.d)) {
                    if (gjh.a(axak2).equals(gjh.a(axak))) {
                        a.remove(axak2);
                        break;
                    }
                }
            }
            access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
            axak2.a(access$000);
            Object b = axak2.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            axui axui = (axui) obj;
            anxr access$0002 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
            axak.a(access$0002);
            Object b2 = axak.h.b(access$0002.d);
            if (b2 == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b2);
            }
            axui axui2 = (axui) b;
            anxr access$0003 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
            axak2.a(access$0003);
            if (axak2.h.a(access$0003.d)) {
                access$0003 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
                axak.a(access$0003);
                if (axak.h.a(access$0003.d)) {
                    int a2 = aqzp.a(axui.b);
                    int i = 1;
                    if (a2 != 0 && a2 == 4) {
                        a2 = aqzp.a(axui.b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int a3 = aqzp.a(axui2.b);
                        if (a3 != 0) {
                            i = a3;
                        }
                        if (a2 == i) {
                            anxl anxl = axui.c;
                            if (anxl == null) {
                                anxl = arml.f;
                            }
                            b = axui2.c;
                            if (b == null) {
                                b = arml.f;
                            }
                            if (anxl.equals(b)) {
                                a.remove(axak2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int a4 = aqzp.a(axui.b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int a5 = aqzp.a(axui2.b);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        if (a4 == a5) {
                            a.remove(axak2);
                            break;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        a.add(0, axak);
        ArrayList arrayList = new ArrayList(a.size());
        arrayList.addAll(a);
        axum axum = (axum) axun.d.createBuilder();
        axum.copyOnWrite();
        axun axun = (axun) axum.instance;
        if (!axun.b.a()) {
            axun.b = anxl.mutableCopy(axun.b);
        }
        anvf.addAll(arrayList, axun.b);
        this.a.edit().putString("recent_stickers", Base64.encodeToString(((axun) ((anxl) axum.build())).toByteArray(), 0)).apply();
    }

    public final List a() {
        String string = this.a.getString("recent_stickers", null);
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        List arrayList;
        byte[] decode = Base64.decode(string, 0);
        try {
            axun axun = (axun) anxl.parseFrom(axun.d, decode, anxa.c());
            arrayList = new ArrayList(axun.b.size());
            arrayList.addAll(axun.b);
        } catch (anyg e) {
            xtl.a("Error reading recent stickers.", e);
            arrayList = new ArrayList();
        }
        return arrayList;
    }
}
