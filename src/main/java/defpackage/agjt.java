package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agjt */
public final class agjt extends AsyncTask {
    private final /* synthetic */ DebugOfflineAdActivity a;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        xpr.a(this.a, (CharSequence) "All offline ad expiration times have been changed!", 1);
        new agjm(this.a).execute(new Void[]{null});
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Long[] lArr = (Long[]) objArr;
        agfi h = this.a.d.h();
        avmn avmn = (avmn) avmk.d.createBuilder();
        long longValue = lArr[0].longValue();
        avmn.copyOnWrite();
        avmk avmk = (avmk) avmn.instance;
        avmk.a |= 4;
        avmk.c = (float) longValue;
        avmk = (avmk) ((anxl) avmn.build());
        aojp aojp = (aojp) aojm.d.createBuilder();
        aojn aojn = (aojn) aojk.c.createBuilder();
        aojn.copyOnWrite();
        aojk aojk = (aojk) aojn.instance;
        if (avmk != null) {
            aojk.b = avmk;
            aojk.a |= 1;
            aojp.copyOnWrite();
            aojm aojm = (aojm) aojp.instance;
            aojm.c = (aojk) ((anxl) aojn.build());
            aojm.a |= 1;
            aojm = (aojm) ((anxl) aojp.build());
            for (agqy agqy : this.a.d.k().a()) {
                List<vsd> v = h.v(agqy.a());
                if (!v.isEmpty()) {
                    for (vsd vsd : v) {
                        vse a = h.a(agqy.a(), vsd.g);
                        if (a != null) {
                            SQLiteDatabase f;
                            try {
                                List arrayList = new ArrayList();
                                for (aogm aogm : vsd.m()) {
                                    aogl aogl = (aogl) ((anxo) aogm.toBuilder());
                                    anxl anxl = aogm.b;
                                    if (anxl == null) {
                                        anxl = ayxm.o;
                                    }
                                    ayxp ayxp = (ayxp) ((anxo) anxl.toBuilder());
                                    ayxp.copyOnWrite();
                                    ayxm ayxm = (ayxm) ayxp.instance;
                                    if (aojm != null) {
                                        ayxm.h = aojm;
                                        ayxm.a |= 256;
                                        aogl.copyOnWrite();
                                        aogm aogm2 = (aogm) aogl.instance;
                                        aogm2.b = (ayxm) ((anxl) ayxp.build());
                                        aogm2.a |= 1;
                                        arrayList.add((aogm) ((anxl) aogl.build()));
                                    } else {
                                        throw new NullPointerException();
                                    }
                                }
                                aafx aafx = vsd.c;
                                aogj aogj = (aogj) ((anxo) aafx.a.toBuilder());
                                aogj.copyOnWrite();
                                ((aogi) aogj.instance).c = anxl.emptyProtobufList();
                                aogj.copyOnWrite();
                                aogi aogi = (aogi) aogj.instance;
                                if (!aogi.c.a()) {
                                    aogi.c = anxl.mutableCopy(aogi.c);
                                }
                                anvf.addAll(arrayList, aogi.c);
                                aafx.a = (aogi) ((anxl) aogj.build());
                                List a2 = this.a.l.a(vsd, arrayList, a.r());
                                if (!a2.isEmpty()) {
                                    String a3 = agqy.a();
                                    Object obj = vsd.g;
                                    a = (vse) a2.get(0);
                                    xvd.a(a3);
                                    amqw.a(obj);
                                    amqw.a((Object) a);
                                    f = h.f();
                                    f.beginTransaction();
                                    if (h.c.b(a3) && h.e.a(a3)) {
                                        h.f.c.a().update("ads", ages.a(a), "original_video_id=? AND ad_break_id=?", new String[]{a3, obj});
                                        f.setTransactionSuccessful();
                                    }
                                    f.endTransaction();
                                }
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                f.endTransaction();
                            }
                        }
                    }
                    continue;
                }
            }
            return null;
        }
        throw new NullPointerException();
    }

    /* synthetic */ agjt(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }
}
