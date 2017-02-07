package jaffer.xposed_test;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;

import tools.IntentFilterLogger;
import tools.IntentLogger;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

public class MainActivity implements IXposedHookLoadPackage{

    public void handleLoadPackage(LoadPackageParam lp) throws Throwable{

        /*
        *  hook intent for activity.
        *
        * */
        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivity", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivity)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "startActivity", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivity)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "startActivity", Intent.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivity)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityForResult", Intent.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivityForResult)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startNextMatchingActivity", Intent.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startNextMatchingActivity)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startNextMatchingActivity", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startNextMatchingActivity)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityForResult", Intent.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivityForResult)", str);
            }

            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("afterdumpIntent(startActivityForResult)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityIfNeeded", Intent.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivityIfNeeded)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityIfNeeded", Intent.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startActivityIfNeeded)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "navigateUpTo", Intent.class,  new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(navigateUpTo)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "navigateUpToFromChild", Activity.class, Intent.class,  new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(navigateUpToFromChild)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "shouldUpRecreateTask", Intent.class,  new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(shouldUpRecreateTask)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityFromChild", Activity.class, Intent.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startActivityFromChild)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityFromChild", Activity.class, Intent.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startActivityFromChild)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityFromFragment", Fragment.class, Intent.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startActivityFromFragment)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startActivityFromFragment", Fragment.class, Intent.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startActivityFromFragment)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSender", IntentSender.class, Intent.class, int.class, int.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startIntentSender)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSender", IntentSender.class, Intent.class, int.class, int.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[1];
                IntentLogger.dump("dumpIntent(startIntentSender)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSenderFromChild", Activity.class, IntentSender.class, int.class, Intent.class, int.class, int.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[3];
                IntentLogger.dump("dumpIntent(startIntentSenderFromChild)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSenderFromChild", Activity.class, IntentSender.class, int.class, Intent.class, int.class, int.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[3];
                IntentLogger.dump("dumpIntent(startIntentSenderFromChild)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSenderForResult", IntentSender.class, int.class, Intent.class, int.class, int.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[2];
                IntentLogger.dump("dumpIntent(startIntentSenderForResult)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "startIntentSenderForResult", IntentSender.class, int.class, Intent.class, int.class, int.class, int.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[2];
                IntentLogger.dump("dumpIntent(startIntentSenderForResult)", str);
            }
        });


        findAndHookMethod("android.app.Activity", lp.classLoader, "onActivityResult", int.class, int.class, Intent.class,  new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[2];
                IntentLogger.dump("dumpIntent(onActivityResult)", str);
            }
        });

        findAndHookMethod("android.app.Activity", lp.classLoader, "onNewIntent", Intent.class,  new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(onNewIntent)", str);
            }
        });

        /*
        *  hook intent for service
        *
        *
        * */

        findAndHookMethod("android.app.Service", lp.classLoader, "onUnbind", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(onUnbind)", str);
            }
        });

        findAndHookMethod("android.app.Service", lp.classLoader, "onStartCommand", Intent.class, int.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(onStartCommand)", str);
            }
        });

        findAndHookMethod("android.app.Service", lp.classLoader, "onRebind", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(onRebind)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "startService", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(startService)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "stopService", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(stopService)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "bindService", Intent.class, ServiceConnection.class, int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(bindService)", str);
            }
        });

        /*
        *  hook intent for broadcast
        *
        * */

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendBroadcast", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "registerReceiver", BroadcastReceiver.class, IntentFilter.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                IntentFilter str = (IntentFilter) param.args[1];
                IntentFilterLogger.dump("dumpIntent(registerReceiver)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendBroadcast", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendBroadcast", Intent.class, String.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendOrderedBroadcast", Intent.class, String.class, BroadcastReceiver.class, Handler.class, int.class, String.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendOrderedBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendOrderedBroadcast", Intent.class, String.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendOrderedBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendOrderedBroadcastAsUser", Intent.class, UserHandle.class, String.class, BroadcastReceiver.class, Handler.class, int.class, String.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendOrderedBroadcastAsUser)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "removeStickyBroadcast", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(removeStickyBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "removeStickyBroadcastAsUser", Intent.class, UserHandle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(removeStickyBroadcastAsUser)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "removeStickyBroadcastAsUser", Intent.class, UserHandle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(removeStickyBroadcastAsUser)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendStickyBroadcast", Intent.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendStickyBroadcast)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendStickyBroadcastAsUser", Intent.class, UserHandle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendStickyBroadcastAsUser)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendStickyOrderedBroadcast", Intent.class, BroadcastReceiver.class, Handler.class, int.class, String.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendStickyBroadcastAsUser)", str);
            }
        });

        findAndHookMethod("android.content.ContextWrapper", lp.classLoader, "sendStickyOrderedBroadcastAsUser", Intent.class, UserHandle.class, BroadcastReceiver.class, Handler.class, int.class, String.class, Bundle.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                Intent str = (Intent) param.args[0];
                IntentLogger.dump("dumpIntent(sendStickyBroadcastAsUser)", str);
            }
        });
    }
}