package edu.msu.cbowen.wxwidgetsclionplugin;

import com.intellij.icons.AllIcons;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.ProjectBundle;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DemoModuleType extends ModuleType<ModuleBuilder>{
    public final static String TYPE_ID = "DEMO_MODULE";

    public DemoModuleType() {
        super(TYPE_ID);
    }

    @Override
    public @NotNull ModuleBuilder createModuleBuilder() {
        return new DemoModuleBuilder();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public @NotNull String getName() {
        return "wxWidget Project";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @Override
    public @NotNull String getDescription() {
        return "Description of wxWidgets Project";
    }

    @Override
    public @NotNull Icon getNodeIcon(boolean isOpened) {
        return AllIcons.Nodes.Module;
    }
}
