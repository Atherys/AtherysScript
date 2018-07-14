package com.atherys.script.api.library;

/**
 * Represents an extension to a {@link ScriptLibrary}. This can contain a specialized set of functions or global
 * variables to be injected into the execution environment of the script ( usually a  {@link javax.script.ScriptEngine} )
 */
public interface LibraryExtension {

    void extend(ScriptLibrary library);

}
