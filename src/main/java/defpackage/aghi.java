package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: aghi */
final class aghi implements xbt {
    private final agpi a;

    aghi(agpi agpi) {
        this.a = agpi;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        agpi agpi = this.a;
        if (agpi != null) {
            agpj agpj = new agpj(agpi.a, agpi.b);
            Cursor query;
            try {
                File a;
                String str;
                aaft aaft;
                File b;
                agpi = this.a;
                query = sQLiteDatabase.query("videosV2", agiq.a, null, null, null, null, null, null);
                List<agqp> b2 = new aght(query, this.a, null).b();
                query.close();
                List asList = Arrays.asList(new Integer[]{Integer.valueOf(240), Integer.valueOf(480)});
                for (agqp agqp : b2) {
                    File file = new File(agpj.a(agqp.a()), "thumb_small.jpg");
                    File file2 = new File(agpj.a(agqp.a()), "thumb_large.jpg");
                    aygk aygk = agqp.e.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aaft aaft2 = new aaft(ahdh.a(aygk, asList));
                    if (file.exists()) {
                        if (!aaft2.a.isEmpty()) {
                            File a2 = agpi.a(agqp.a(), aaft2.b().a());
                            anbk.c(a2);
                            anbk.a(file, a2);
                            if (file2.exists() && aaft2.a.size() > 1) {
                                a = agpi.a(agqp.a(), aaft2.c().a());
                                anbk.c(a);
                                anbk.a(file2, a);
                            }
                        }
                    }
                    file.delete();
                    file2.delete();
                }
                agpi = this.a;
                query = sQLiteDatabase.query("playlistsV2", agfm.a, null, null, null, null, null, null);
                List<agqi> b3 = new agfr(query, this.a, null).b();
                query.close();
                for (agqi agqi : b3) {
                    str = agqi.a;
                    if (agpj.c == null) {
                        agpj.c = new File(agpj.a, "playlists");
                    }
                    a = new File(new File(agpj.c, str), "thumb.jpg");
                    aygk aygk2 = agqi.i.c;
                    if (aygk2 == null) {
                        aygk2 = aygk.f;
                    }
                    aaft = new aaft(ahdh.a(aygk2, Collections.singletonList(Integer.valueOf(480))));
                    if (a.exists()) {
                        if (!aaft.a.isEmpty()) {
                            b = agpi.b(agqi.a, aaft.b().a());
                            anbk.c(b);
                            anbk.a(a, b);
                        }
                    }
                    a.delete();
                }
                agpi = this.a;
                query = sQLiteDatabase.query("channels", agfk.a, null, null, null, null, null, null);
                aget aget = new aget(query, this.a);
                ArrayList<agpy> arrayList = new ArrayList(aget.a.getCount());
                while (aget.a.moveToNext()) {
                    arrayList.add(aget.a());
                }
                query.close();
                for (agpy agpy : arrayList) {
                    str = agpy.a;
                    if (agpj.b == null) {
                        agpj.b = new File(agpj.a, "channels");
                    }
                    a = agpj.b;
                    str = String.valueOf(str);
                    String str2 = ".jpg";
                    File file3 = new File(a, str2.length() == 0 ? new String(str) : str.concat(str2));
                    avna avna = agpy.d.b;
                    if (avna == null) {
                        avna = avna.g;
                    }
                    aygk aygk3 = avna.c;
                    if (aygk3 == null) {
                        aygk3 = aygk.f;
                    }
                    aaft = new aaft(ahdh.a(aygk3, Collections.singletonList(Integer.valueOf(240))));
                    if (file3.exists()) {
                        if (!aaft.a.isEmpty()) {
                            b = agpi.c(agpy.a, aaft.b().a());
                            anbk.c(b);
                            anbk.a(file3, b);
                        }
                    }
                    file3.delete();
                }
            } catch (IOException e) {
                xtl.a("FileStore migration failed.", e);
            } catch (Throwable th) {
                query.close();
            }
        }
    }
}
