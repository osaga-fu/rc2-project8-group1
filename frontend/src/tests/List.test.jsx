import { render, fireEvent, screen } from "@testing-library/react";
import { List } from "../components/List/List";
import { test } from "vitest";

test("simula una búsqueda en la aplicación", () => {
  render(<List />);

  const inputElement = screen.getByPlaceholderText("Buscar libro...");
  fireEvent.change(inputElement, { target: { value: "Harry Potter" } });
  expect(inputElement.value).toBe("Harry Potter");
});
