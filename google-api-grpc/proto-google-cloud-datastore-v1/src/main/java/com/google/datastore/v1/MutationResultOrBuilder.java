// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

public interface MutationResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.MutationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   */
  com.google.datastore.v1.Key getKey();
  /**
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   */
  com.google.datastore.v1.KeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * The version of the entity on the server after processing the mutation. If
   * the mutation doesn't change anything on the server, then the version will
   * be the version of the current entity or, if no entity is present, a version
   * that is strictly greater than the version of any previous entity and less
   * than the version of any possible future entity.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   */
  long getVersion();

  /**
   * <pre>
   * Whether a conflict was detected for this mutation. Always false when a
   * conflict detection strategy field is not set in the mutation.
   * </pre>
   *
   * <code>bool conflict_detected = 5;</code>
   */
  boolean getConflictDetected();
}
