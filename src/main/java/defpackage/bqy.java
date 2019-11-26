package defpackage;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bqy */
public final class bqy implements ComponentCallbacks2 {
    private static volatile bqy h;
    private static volatile boolean i;
    public final bwd a;
    public final brb b;
    public final brd c;
    public final bwb d;
    public final cez e;
    public final cep f;
    public final List g = new ArrayList();
    private final bxk j;

    public static bqy a(Context context) {
        if (h == null) {
            synchronized (bqy.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    i = true;
                    bqy.a(context, new bra());
                    i = false;
                }
            }
        }
        return h;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    private static void a(Context context, bra bra) {
        bra bra2 = bra;
        Context applicationContext = context.getApplicationContext();
        bqu c = bqy.c();
        List emptyList = Collections.emptyList();
        List list;
        if (c != null) {
            c.a();
            list = emptyList;
        } else {
            cfl cfl = new cfl(applicationContext);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = cfl.a.getPackageManager().getApplicationInfo(cfl.a.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(cfl.a(str));
                        }
                    }
                }
                list = arrayList;
            } catch (NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        if (!(c == null || c.b().isEmpty())) {
            Set b = c.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (b.contains(((cfj) it.next()).getClass())) {
                    it.remove();
                }
            }
        }
        bra2.m = c != null ? c.c() : null;
        for (cfj a : list) {
            a.a(applicationContext, bra2);
        }
        if (c != null) {
            c.a(applicationContext, bra2);
        }
        if (bra2.f == null) {
            bra2.f = bxr.a(bxr.b(), "source", bxw.b);
        }
        if (bra2.g == null) {
            bra2.g = bxr.a();
        }
        if (bra2.n == null) {
            bra2.n = new bxr(new ThreadPoolExecutor(0, bxr.b() >= 4 ? 2 : 1, bxr.a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new bxu("animation", bxw.b, true)));
        }
        if (bra2.i == null) {
            bra2.i = new bxl(applicationContext).a();
        }
        if (bra2.j == null) {
            bra2.j = new ceu();
        }
        if (bra2.c == null) {
            int i = bra2.i.a;
            if (i > 0) {
                bra2.c = new bwo((long) i);
            } else {
                bra2.c = new bwg();
            }
        }
        if (bra2.d == null) {
            bra2.d = new bwj(bra2.i.c);
        }
        if (bra2.e == null) {
            bra2.e = new bxh((long) bra2.i.b);
        }
        if (bra2.h == null) {
            bra2.h = new bxf(applicationContext);
        }
        if (bra2.b == null) {
            bra2.b = new buv(bra2.e, bra2.h, bra2.g, bra2.f, new bxr(new ThreadPoolExecutor(0, Integer.MAX_VALUE, bxr.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new bxu("source-unlimited", bxw.b, false))), bra2.n);
        }
        emptyList = bra2.o;
        if (emptyList == null) {
            bra2.o = Collections.emptyList();
        } else {
            bra2.o = Collections.unmodifiableList(emptyList);
        }
        bqy bqy = new bqy(applicationContext, bra2.b, bra2.e, bra2.c, bra2.d, new cez(bra2.m), bra2.j, bra2.k, bra2.l, bra2.a, bra2.o);
        for (cfj cfj : list) {
            try {
                cfj.a(applicationContext, bqy, bqy.c);
            } catch (AbstractMethodError e2) {
                String name = cfj.getClass().getName();
                String str2 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ";
                if (name.length() == 0) {
                    name = new String(str2);
                } else {
                    name = str2.concat(name);
                }
                throw new IllegalStateException(name, e2);
            }
        }
        if (c != null) {
            c.a(applicationContext, bqy, bqy.c);
        }
        applicationContext.registerComponentCallbacks(bqy);
        h = bqy;
    }

    private static bqu c() {
        bqu bqu = null;
        try {
            bqu = (bqu) Class.forName("bqt").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            String str = "Glide";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
        } catch (InstantiationException e) {
            bqy.a(e);
        } catch (IllegalAccessException e2) {
            bqy.a(e2);
        } catch (NoSuchMethodException e22) {
            bqy.a(e22);
        } catch (InvocationTargetException e222) {
            bqy.a(e222);
        }
        return bqu;
    }

    private static void a(Exception exception) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exception);
    }

    private bqy(Context context, buv buv, bxk bxk, bwd bwd, bwb bwb, cez cez, cep cep, int i, bqx bqx, Map map, List list) {
        Context context2 = context;
        bwd bwd2 = bwd;
        bwb bwb2 = bwb;
        Class cls = byte[].class;
        this.a = bwd2;
        this.d = bwb2;
        this.j = bxk;
        this.e = cez;
        this.f = cep;
        Resources resources = context.getResources();
        this.c = new brd();
        this.c.a(new cbp());
        if (VERSION.SDK_INT >= 27) {
            this.c.a(new cch());
        }
        List a = this.c.a();
        ccb ccb = new ccb(a, resources.getDisplayMetrics(), bwd2, bwb2);
        cdn cdn = new cdn(context2, a, bwd2, bwb2);
        ccv ccv = new ccv(bwd2, new cdb());
        cbl cbl = new cbl(ccb);
        ccp ccp = new ccp(ccb, bwb2);
        cdj cdj = new cdj(context2);
        cad cad = new cad(resources);
        cag cag = new cag(resources);
        cae cae = new cae(resources);
        cab cab = new cab(resources);
        Class cls2 = cls;
        bss cbk = new cbk(bwb2);
        ced ced = new ced();
        cei cei = new cei();
        ContentResolver contentResolver = context.getContentResolver();
        brd brd = this.c;
        cab cab2 = cab;
        brd.a(ByteBuffer.class, new byj());
        brd.a(InputStream.class, new caf(bwb2));
        cag cag2 = cag;
        String str = "Bitmap";
        brd.a(str, ByteBuffer.class, Bitmap.class, cbl);
        brd.a(str, InputStream.class, Bitmap.class, ccp);
        brd.a(str, ParcelFileDescriptor.class, Bitmap.class, ccv);
        cae cae2 = cae;
        cad cad2 = cad;
        cdj cdj2 = cdj;
        brd.a(str, AssetFileDescriptor.class, Bitmap.class, new ccv(bwd2, new cda()));
        brd.a(Bitmap.class, Bitmap.class, cal.a);
        brd.a(str, Bitmap.class, Bitmap.class, new cct());
        brd.a(Bitmap.class, cbk);
        cbi cbi = new cbi(resources, cbl);
        String str2 = "BitmapDrawable";
        brd.a(str2, ByteBuffer.class, BitmapDrawable.class, cbi);
        brd.a(str2, InputStream.class, BitmapDrawable.class, new cbi(resources, ccp));
        brd.a(str2, ParcelFileDescriptor.class, BitmapDrawable.class, new cbi(resources, ccv));
        brd.a(BitmapDrawable.class, new cbh(bwd2, cbk));
        cee cee = new cee(a, cdn, bwb2);
        String str3 = "Gif";
        brd.a(str3, InputStream.class, cdr.class, cee);
        brd.a(str3, ByteBuffer.class, cdr.class, cdn);
        brd.a(cdr.class, new cdt());
        brd.a(brz.class, brz.class, cal.a);
        brd.a(str, brz.class, Bitmap.class, new cec(bwd2));
        bsp bsp = cdj2;
        brd.a(Uri.class, Drawable.class, bsp);
        brd.a(Uri.class, Bitmap.class, new ccn(bsp, bwd2));
        brd.a(new cdd());
        brd.a(File.class, ByteBuffer.class, new byo());
        brd.a(File.class, InputStream.class, new bza());
        brd.a(File.class, File.class, new cdl());
        brd.a(File.class, ParcelFileDescriptor.class, new byw());
        brd.a(File.class, File.class, cal.a);
        brd.a(new btj(bwb2));
        bzs bzs = cad2;
        brd.a(Integer.TYPE, InputStream.class, bzs);
        bzs bzs2 = cae2;
        brd.a(Integer.TYPE, ParcelFileDescriptor.class, bzs2);
        brd.a(Integer.class, InputStream.class, bzs);
        brd.a(Integer.class, ParcelFileDescriptor.class, bzs2);
        bzs = cag2;
        brd.a(Integer.class, Uri.class, bzs);
        bzs2 = cab2;
        brd.a(Integer.TYPE, AssetFileDescriptor.class, bzs2);
        brd.a(Integer.class, AssetFileDescriptor.class, bzs2);
        brd.a(Integer.TYPE, Uri.class, bzs);
        brd.a(String.class, InputStream.class, new bys());
        brd.a(Uri.class, InputStream.class, new bys());
        brd.a(String.class, InputStream.class, new caj());
        brd.a(String.class, ParcelFileDescriptor.class, new cak());
        brd.a(String.class, AssetFileDescriptor.class, new cah());
        brd.a(Uri.class, InputStream.class, new cax());
        brd.a(Uri.class, InputStream.class, new byb(context.getAssets()));
        brd.a(Uri.class, ParcelFileDescriptor.class, new byc(context.getAssets()));
        Context context3 = context;
        ceh ceh = ced;
        brd.a(Uri.class, InputStream.class, new caz(context3));
        brd.a(Uri.class, InputStream.class, new cbb(context3));
        ContentResolver contentResolver2 = contentResolver;
        brd.a(Uri.class, InputStream.class, new car(contentResolver2));
        brd.a(Uri.class, ParcelFileDescriptor.class, new cap(contentResolver2));
        brd.a(Uri.class, AssetFileDescriptor.class, new caq(contentResolver2));
        brd.a(Uri.class, InputStream.class, new cat());
        brd.a(URL.class, InputStream.class, new cbd());
        brd.a(Uri.class, File.class, new bzk(context3));
        brd.a(bzc.class, InputStream.class, new cav());
        Class cls3 = cls2;
        brd.a(cls3, ByteBuffer.class, new byd());
        brd.a(cls3, InputStream.class, new byh());
        brd.a(Uri.class, Uri.class, cal.a);
        brd.a(Drawable.class, Drawable.class, cal.a);
        brd.a(Drawable.class, Drawable.class, new cdm());
        brd.a(Bitmap.class, BitmapDrawable.class, new ceg(resources));
        brd.a(Bitmap.class, cls3, ceh);
        ceh ceh2 = cei;
        brd.a(Drawable.class, cls3, new cef(bwd2, ceh, ceh2));
        brd.a(cdr.class, cls3, ceh2);
        context2 = context;
        bwb2 = bwb;
        this.b = new brb(context2, bwb2, this.c, new cgn(), bqx, map, list, buv, i);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void b() {
        chv.a();
        this.j.a();
        this.a.a();
        this.d.a();
    }

    private static cez c(Context context) {
        chw.a((Object) context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return bqy.a(context).e;
    }

    public static brl b(Context context) {
        return bqy.c(context).a(context);
    }

    public static brl a(nn nnVar) {
        return bqy.c(nnVar).a(nnVar);
    }

    public final void onTrimMemory(int i) {
        chv.a();
        this.j.a(i);
        this.a.a(i);
        this.d.a(i);
    }

    public final void onLowMemory() {
        b();
    }
}
