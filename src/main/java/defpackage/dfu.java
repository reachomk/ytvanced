package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import java.util.List;

/* renamed from: dfu */
final class dfu extends PackageManager {
    private final Context a;
    private final PackageManager b;

    public dfu(Context context) {
        this.a = context;
        this.b = context.getPackageManager();
    }

    public final ApplicationInfo getApplicationInfo(String str, int i) {
        ApplicationInfo applicationInfo = this.b.getApplicationInfo(str, i);
        if (str.equals(this.a.getPackageName()) && (i & 128) == 128) {
            if (applicationInfo.metaData == null) {
                applicationInfo.metaData = new Bundle();
            }
            applicationInfo.metaData.putInt("com.google.android.gms.version", 4323000);
        }
        return applicationInfo;
    }

    public final PackageInfo getPackageInfo(String str, int i) {
        return this.b.getPackageInfo(str, i);
    }

    public final void addPackageToPreferred(String str) {
        this.b.addPackageToPreferred(str);
    }

    public final boolean addPermission(PermissionInfo permissionInfo) {
        return this.b.addPermission(permissionInfo);
    }

    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.b.addPermissionAsync(permissionInfo);
    }

    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.b.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.b.canonicalToCurrentPackageNames(strArr);
    }

    public final int checkPermission(String str, String str2) {
        return this.b.checkPermission(str, str2);
    }

    public final int checkSignatures(int i, int i2) {
        return this.b.checkSignatures(i, i2);
    }

    public final int checkSignatures(String str, String str2) {
        return this.b.checkSignatures(str, str2);
    }

    public final void clearPackagePreferredActivities(String str) {
        this.b.clearPackagePreferredActivities(str);
    }

    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.b.currentToCanonicalPackageNames(strArr);
    }

    public final void extendVerificationTimeout(int i, int i2, long j) {
        this.b.extendVerificationTimeout(i, i2, j);
    }

    public final Drawable getActivityIcon(Intent intent) {
        return this.b.getActivityIcon(intent);
    }

    public final Drawable getActivityIcon(ComponentName componentName) {
        return this.b.getActivityIcon(componentName);
    }

    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return this.b.getActivityInfo(componentName, i);
    }

    public final Drawable getActivityLogo(Intent intent) {
        return this.b.getActivityLogo(intent);
    }

    public final Drawable getActivityLogo(ComponentName componentName) {
        return this.b.getActivityLogo(componentName);
    }

    public final List getAllPermissionGroups(int i) {
        return this.b.getAllPermissionGroups(i);
    }

    public final int getApplicationEnabledSetting(String str) {
        return this.b.getApplicationEnabledSetting(str);
    }

    public final Drawable getApplicationIcon(String str) {
        return this.b.getApplicationIcon(str);
    }

    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        return this.b.getApplicationIcon(applicationInfo);
    }

    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.b.getApplicationLabel(applicationInfo);
    }

    public final Drawable getApplicationLogo(String str) {
        return this.b.getApplicationLogo(str);
    }

    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        return this.b.getApplicationLogo(applicationInfo);
    }

    public final int getComponentEnabledSetting(ComponentName componentName) {
        return this.b.getComponentEnabledSetting(componentName);
    }

    public final Drawable getDefaultActivityIcon() {
        return this.b.getDefaultActivityIcon();
    }

    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.b.getDrawable(str, i, applicationInfo);
    }

    public final List getInstalledApplications(int i) {
        return this.b.getInstalledApplications(i);
    }

    public final List getInstalledPackages(int i) {
        return this.b.getInstalledPackages(i);
    }

    public final String getInstallerPackageName(String str) {
        return this.b.getInstallerPackageName(str);
    }

    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.b.getInstrumentationInfo(componentName, i);
    }

    public final Intent getLaunchIntentForPackage(String str) {
        return this.b.getLaunchIntentForPackage(str);
    }

    public final String getNameForUid(int i) {
        return this.b.getNameForUid(i);
    }

    public final int[] getPackageGids(String str) {
        return this.b.getPackageGids(str);
    }

    public final String[] getPackagesForUid(int i) {
        return this.b.getPackagesForUid(i);
    }

    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.b.getPackagesHoldingPermissions(strArr, i);
    }

    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.b.getPermissionGroupInfo(str, i);
    }

    public final PermissionInfo getPermissionInfo(String str, int i) {
        return this.b.getPermissionInfo(str, i);
    }

    public final int getPreferredActivities(List list, List list2, String str) {
        return this.b.getPreferredActivities(list, list2, str);
    }

    public final List getPreferredPackages(int i) {
        return this.b.getPreferredPackages(i);
    }

    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.b.getProviderInfo(componentName, i);
    }

    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.b.getReceiverInfo(componentName, i);
    }

    public final Resources getResourcesForActivity(ComponentName componentName) {
        return this.b.getResourcesForActivity(componentName);
    }

    public final Resources getResourcesForApplication(String str) {
        return this.b.getResourcesForApplication(str);
    }

    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) {
        return this.b.getResourcesForApplication(applicationInfo);
    }

    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.b.getServiceInfo(componentName, i);
    }

    public final FeatureInfo[] getSystemAvailableFeatures() {
        return this.b.getSystemAvailableFeatures();
    }

    public final String[] getSystemSharedLibraryNames() {
        return this.b.getSystemSharedLibraryNames();
    }

    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.b.getText(str, i, applicationInfo);
    }

    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.b.getXml(str, i, applicationInfo);
    }

    public final boolean hasSystemFeature(String str) {
        return this.b.hasSystemFeature(str);
    }

    public final boolean isSafeMode() {
        return this.b.isSafeMode();
    }

    public final List queryBroadcastReceivers(Intent intent, int i) {
        return this.b.queryBroadcastReceivers(intent, i);
    }

    public final List queryContentProviders(String str, int i, int i2) {
        return this.b.queryContentProviders(str, i, i2);
    }

    public final List queryInstrumentation(String str, int i) {
        return this.b.queryInstrumentation(str, i);
    }

    public final List queryIntentActivities(Intent intent, int i) {
        return this.b.queryIntentActivities(intent, i);
    }

    public final List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.b.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    public final List queryIntentContentProviders(Intent intent, int i) {
        return this.b.queryIntentContentProviders(intent, i);
    }

    public final List queryIntentServices(Intent intent, int i) {
        return this.b.queryIntentServices(intent, i);
    }

    public final List queryPermissionsByGroup(String str, int i) {
        return this.b.queryPermissionsByGroup(str, i);
    }

    public final void removePackageFromPreferred(String str) {
        this.b.removePackageFromPreferred(str);
    }

    public final void removePermission(String str) {
        this.b.removePermission(str);
    }

    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return this.b.resolveActivity(intent, i);
    }

    public final ProviderInfo resolveContentProvider(String str, int i) {
        return this.b.resolveContentProvider(str, i);
    }

    public final ResolveInfo resolveService(Intent intent, int i) {
        return this.b.resolveService(intent, i);
    }

    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        this.b.setApplicationEnabledSetting(str, i, i2);
    }

    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.b.setComponentEnabledSetting(componentName, i, i2);
    }

    public final void setInstallerPackageName(String str, String str2) {
        this.b.setInstallerPackageName(str, str2);
    }

    public final void verifyPendingInstall(int i, int i2) {
        this.b.verifyPendingInstall(i, i2);
    }

    public final PackageInstaller getPackageInstaller() {
        return this.b.getPackageInstaller();
    }

    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return this.b.getUserBadgedLabel(charSequence, userHandle);
    }

    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return this.b.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return this.b.getUserBadgedIcon(drawable, userHandle);
    }

    public final Drawable getActivityBanner(Intent intent) {
        return this.b.getActivityBanner(intent);
    }

    public final Drawable getActivityBanner(ComponentName componentName) {
        return this.b.getActivityBanner(componentName);
    }

    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        return this.b.getApplicationBanner(applicationInfo);
    }

    public final Drawable getApplicationBanner(String str) {
        return this.b.getApplicationBanner(str);
    }

    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        return this.b.getLeanbackLaunchIntentForPackage(str);
    }
}
